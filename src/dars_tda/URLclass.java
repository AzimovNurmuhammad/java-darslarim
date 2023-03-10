package dars_tda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.ChangedCharSetException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.ElementIterator;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath; public class URLclass extends JFrame {

    public URLclass() {
        super("Using URL class");
        pane = new JEditorPane();
        pane.setEditable(false); // Read-only
        getContentPane().add(new JScrollPane(pane), "Center");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.EAST;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0.0;
        c.weighty = 0.0;
        JLabel urlLabel = new JLabel("URL: ", JLabel.RIGHT);
        panel.add(urlLabel, c);
        JLabel loadingLabel = new JLabel("State: ", JLabel.RIGHT);
        c.gridy = 1;
        panel.add(loadingLabel, c);
        JLabel typeLabel = new JLabel("Type: ", JLabel.RIGHT);
        c.gridy = 2;
        panel.add(typeLabel, c);
        c.gridy = 3;
        panel.add(new JLabel(LOAD_TIME), c);
        c.gridy = 4;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.anchor = GridBagConstraints.WEST;
        onlineLoad = new JCheckBox("Online Load");
        panel.add(onlineLoad, c);
        onlineLoad.setSelected(true);
        onlineLoad.setForeground(typeLabel.getForeground());
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.EAST;
        c.fill = GridBagConstraints.HORIZONTAL;
        urlCombo = new JComboBox();
        panel.add(urlCombo, c);
        urlCombo.setEditable(true);
        loadingState = new JLabel(spaces, JLabel.LEFT);
        loadingState.setForeground(Color.black);
        c.gridy = 1;
        panel.add(loadingState, c);
        loadedType = new JLabel(spaces, JLabel.LEFT);
        loadedType.setForeground(Color.black);
        c.gridy = 2;
        panel.add(loadedType, c);
        timeLabel = new JLabel("");
        c.gridy = 3;
        panel.add(timeLabel, c);
        getContentPane().add(panel, "South");
        DefaultMutableTreeNode emptyRootNode = new DefaultMutableTreeNode(
                "Empty");
        emptyModel = new DefaultTreeModel(emptyRootNode);
        tree = new JTree(emptyModel);
        tree.setPreferredSize(new Dimension(200, 200));
        getContentPane().add(new JScrollPane(tree), "East");
        urlCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (populatingCombo == true) {
                    return;
                }
                Object selection = urlCombo.getSelectedItem();
                try {
                    URL url;
                    if (selection instanceof URL) {
                        url = (URL) selection;
                    } else {
                        url = new URL((String) selection);
                    }           URL loadedURL = pane.getPage();
                    if (loadedURL != null && loadedURL.sameFile(url)) {
                        return;
                    }
                    urlCombo.setEnabled(false); // Disable input
                    urlCombo.paintImmediately(0, 0, urlCombo.getSize().width,
                            urlCombo.getSize().height);
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    // Busy cursor
                    loadingState.setText("Loading...");
                    loadingState.paintImmediately(0, 0,
                            loadingState.getSize().width, loadingState
                                    .getSize().height);
                    loadedType.setText("");
                    loadedType.paintImmediately(0, 0,
                            loadedType.getSize().width,
                            loadedType.getSize().height);
                    timeLabel.setText("");
                    timeLabel.paintImmediately(0, 0, timeLabel.getSize().width,
                            timeLabel.getSize().height);
                    tree.setModel(emptyModel);
                    tree.paintImmediately(0, 0, tree.getSize().width, tree
                            .getSize().height);
                    startTime = System.currentTimeMillis();
                    if (onlineLoad.isSelected()) {
                        pane.setPage(url);
                        loadedType.setText(pane.getContentType());
                    } else {
                        pane.setContentType("text/html");
                        loadedType.setText(pane.getContentType());
                        if (loader == null) {
                            loader = new HTMLDocumentLoader();
                        }
                        HTMLDocument doc = loader.loadDocument(url);
                        loadComplete();
                        pane.setDocument(doc);
                        displayLoadTime();
                        populateCombo(findLinks(doc, null));
                        TreeNode node = buildHeadingTree(doc);
                        tree.setModel(new DefaultTreeModel(node));
                        enableInput();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(pane, new String[] {
                                    "Unable to open file", selection.toString() },
                            "File Open Error", JOptionPane.ERROR_MESSAGE);
                    loadingState.setText("Failed");
                    enableInput();
                }}    });
        pane.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("page")) {
                    loadComplete();
                    displayLoadTime();
                    populateCombo(findLinks(pane.getDocument(), null));
                    TreeNode node = buildHeadingTree(pane.getDocument());
                    tree.setModel(new DefaultTreeModel(node));
                    enableInput();
                }}});
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent evt) {
                TreePath path = evt.getNewLeadSelectionPath();
                if (path != null) {
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) path
                            .getLastPathComponent();
                    Object userObject = node.getUserObject();
                    if (userObject instanceof Heading) {
                        Heading heading = (Heading) userObject;
                        try {
                            Rectangle textRect = pane.modelToView(heading
                                    .getOffset());
                            textRect.y += 3 * textRect.height;
                            pane.scrollRectToVisible(textRect);
                        } catch (BadLocationException e) {
                        }}}} });}
    public void loadComplete() {
        loadingState.setText("Page loaded.");
    }
    public void enableInput() {
        urlCombo.setEnabled(true); // Allow entry of new URL
        setCursor(Cursor.getDefaultCursor());
    }
    public void displayLoadTime() {
        double loadingTime = ((double) (System.currentTimeMillis() - startTime)) / 1000d;
        timeLabel.setText(loadingTime + " seconds");
    }
    public void populateCombo(URL[] urls) {
        Object o = urlCombo.getSelectedItem();
        populatingCombo = true;
        urlCombo.setModel(new DefaultComboBoxModel(urls));
        urlCombo.setSelectedItem(o);
        populatingCombo = false;  }
    public URL[] findLinks(Document doc, String protocol) {
        Vector links = new Vector();
        Vector urlNames = new Vector();
        URL baseURL = (URL) doc.getProperty(Document.StreamDescriptionProperty);
        if (doc instanceof HTMLDocument) {
            Element elem = doc.getDefaultRootElement();
            ElementIterator iterator = new ElementIterator(elem);
            while ((elem = iterator.next()) != null) {
                AttributeSet attrs = elem.getAttributes();
                Object link = attrs.getAttribute(HTML.Tag.A);
                if (link instanceof AttributeSet) {
                    Object linkAttr = ((AttributeSet) link)
                            .getAttribute(HTML.Attribute.HREF);
                    if (linkAttr instanceof String) {
                        try {
                            URL linkURL = new URL(baseURL, (String) linkAttr);
                            if (protocol == null
                                    || protocol.equalsIgnoreCase(linkURL
                                    .getProtocol())) {
                                String linkURLName = linkURL.toString();
                                if (urlNames.contains(linkURLName) == false) {
                                    urlNames.addElement(linkURLName);
                                    links.addElement(linkURL);
                                }
                            }
                        } catch (MalformedURLException e) {
                        }}}}    }
        URL[] urls = new URL[links.size()];
        links.copyInto(urls);
        links.removeAllElements();
        urlNames.removeAllElements();
        return urls;
    }
    public TreeNode buildHeadingTree(Document doc) {
        String title = (String) doc.getProperty(Document.TitleProperty);
        if (title == null) {
            title = "[No title]";
        }
        Heading rootHeading = new Heading(title, 0, 0);
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(
                rootHeading);
        DefaultMutableTreeNode lastNode[] = new DefaultMutableTreeNode[7];
        int lastLevel = 0;
        lastNode[lastLevel] = rootNode;
        if (doc instanceof HTMLDocument) {
            Element elem = doc.getDefaultRootElement();
            ElementIterator iterator = new ElementIterator(elem);
            Heading heading;
            while ((heading = getNextHeading(doc, iterator)) != null) {
                DefaultMutableTreeNode hNode = new DefaultMutableTreeNode(
                        heading);
                int level = heading.getLevel();
                if (level > lastLevel) {
                    for (int i = lastLevel + 1; i < level; i++) {
                        lastNode[i] = null;
                    }
                    lastNode[lastLevel].add(hNode);
                } else {
                    int prevLevel = level - 1;
                    while (prevLevel >= 0) {
                        if (lastNode[prevLevel] != null) {
                            break;
                        }
                        lastNode[prevLevel] = null;
                        prevLevel--;
                    }
                    lastNode[prevLevel].add(hNode);
                }
                lastNode[level] = hNode;
                lastLevel = level;
            }  }
        return rootNode;}
    public Heading getNextHeading(Document doc, ElementIterator iter) {
        Element elem;
        while ((elem = iter.next()) != null) {
            AttributeSet attrs = elem.getAttributes();
            Object type = attrs.getAttribute(StyleConstants.NameAttribute);
            int level = getHeadingLevel(type);
            if (level > 0) {
                String headingText = "";
                int count = elem.getElementCount();
                for (int i = 0; i < count; i++) {
                    Element child = elem.getElement(i);
                    AttributeSet cattrs = child.getAttributes();
                    if (cattrs.getAttribute(StyleConstants.NameAttribute) == HTML.Tag.CONTENT) {
                        try {
                            int offset = child.getStartOffset();
                            headingText += doc.getText(offset, child
                                    .getEndOffset()
                                    - offset);
                        } catch (BadLocationException e) {
                        }}        }
                headingText = headingText.trim();
                return new Heading(headingText, level, elem.getStartOffset());
            }    }
        return null;
    }
    public int getHeadingLevel(Object type) {
        if (type instanceof HTML.Tag) {
            if (type == HTML.Tag.H1) {
                return 1;      }
            if (type == HTML.Tag.H2) {
                return 2;      }
            if (type == HTML.Tag.H3) {
                return 3;      }
            if (type == HTML.Tag.H4) {
                return 4;      }
            if (type == HTML.Tag.H5) {
                return 5;      }
            if (type == HTML.Tag.H6) {
                return 6;      }}
        return -1;}
    static class Heading {
        public Heading(String text, int level, int offset) {
            this.text = text;
            this.level = level;
            this.offset = offset;}
        public String getText() {
            return text;
        }
        public int getOffset() {
            return offset;    }
        public int getLevel() {
            return level;}
        public String toString() {
            return text;    }
        protected String text;
        protected int level;
        protected int offset;}
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception evt) {}
        JFrame f = new URLclass();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }});
        f.setSize(500, 400);
        f.setVisible(true);}
    private static final String spaces = "                    ";
    private static final String LOAD_TIME = "Load time: ";
    private JEditorPane pane;
    private HTMLDocumentLoader loader;
    private JLabel loadingState;
    private JLabel timeLabel;
    private JLabel loadedType;
    private JCheckBox onlineLoad;
    private JComboBox urlCombo;
    private JTree tree;
    private TreeModel emptyModel;
    private long startTime;
    private boolean populatingCombo;
}
class HTMLDocumentLoader {
    public HTMLDocument loadDocument(HTMLDocument doc, URL url, String charSet)
            throws IOException {
        doc.putProperty(Document.StreamDescriptionProperty, url);
        InputStream in = null;
        boolean ignoreCharSet = false;
        for (;;) {
            try {
                doc.remove(0, doc.getLength());
                URLConnection urlc = url.openConnection();
                in = urlc.getInputStream();
                Reader reader = (charSet == null) ? new InputStreamReader(in)
                        : new InputStreamReader(in, charSet);
                HTMLEditorKit.Parser parser = getParser();
                HTMLEditorKit.ParserCallback htmlReader = getParserCallback(doc);
                parser.parse(reader, htmlReader, ignoreCharSet);
                htmlReader.flush();
                break;
            } catch (BadLocationException ex) {
                throw new IOException(ex.getMessage());
            } catch (ChangedCharSetException e) {
                charSet = getNewCharSet(e);
                ignoreCharSet = true;
                in.close();      }    }
        return doc;
    }   public HTMLDocument loadDocument(URL url, String charSet)
            throws IOException {
        return loadDocument((HTMLDocument) kit.createDefaultDocument(), url,
                charSet);
    }   public HTMLDocument loadDocument(URL url) throws IOException {
        return loadDocument(url, null);
    }   // Methods that allow customization of the parser and the callback
    public synchronized HTMLEditorKit.Parser getParser() {
        if (parser == null) {
            try {
                Class c = Class
                        .forName("javax.swing.text.html.parser.ParserDelegator");
                parser = (HTMLEditorKit.Parser) c.newInstance();
            } catch (Throwable e) {
            }}
        return parser;
    }   public synchronized HTMLEditorKit.ParserCallback getParserCallback(
            HTMLDocument doc) {
        return doc.getReader(0);
    }   protected String getNewCharSet(ChangedCharSetException e) {
        String spec = e.getCharSetSpec();
        if (e.keyEqualsCharSet()) {

            return spec;
        }
        int index = spec.indexOf(";");
        if (index != -1) {
            spec = spec.substring(index + 1);
        }
        spec = spec.toLowerCase();     StringTokenizer st = new StringTokenizer(spec, " \t=", true);
        boolean foundCharSet = false;
        boolean foundEquals = false;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals(" ") || token.equals("\t")) {
                continue;
            }
            if (foundCharSet == false && foundEquals == false
                    && token.equals("charset")) {
                foundCharSet = true;
                continue;
            } else if (foundEquals == false && token.equals("=")) {
                foundEquals = true;
                continue;
            } else if (foundEquals == true && foundCharSet == true) {
                return token;
            }         foundCharSet = false;
            foundEquals = false;
        }
        return "8859_1";
    }   protected static HTMLEditorKit kit;   protected static HTMLEditorKit.Parser parser;   static {
        kit = new HTMLEditorKit();
    }
}
