package com.company.Grafik_Muhit;

import javax.swing.JOptionPane;
public class JOptionPane_Kutubxonasi {
    public static void main(String[] args){
        String birinchiRaqam = JOptionPane.showInputDialog("Birnchi rqamni kiriting.");
        String ikkinchiRaqam = JOptionPane.showInputDialog("Ikkinchi raqamni kiriting.");
        int raqam1 = Integer.parseInt(birinchiRaqam);
        int raqam2 = Integer.parseInt(ikkinchiRaqam);
        int yigindi = raqam1 + raqam2;
        JOptionPane.showMessageDialog(null, "Ularni yig'indisi: " +
                yigindi,"sarlavha", JOptionPane.PLAIN_MESSAGE);
    }

}
