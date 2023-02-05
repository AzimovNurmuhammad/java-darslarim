package dars;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
public class Server {
    static float  Yuza(float x, float y)
    {
        return (x*y);
    }
    static float  Peremetr(float x, float y)
    {
        return (float)2*(x+y);
    }

    public static void main(String[] args) throws Exception
    {
        String clientSorov;
        String serverJavob1;
        String serverJavob2;
        ServerSocket serversocket = new ServerSocket(5522);
        while(true)
        {
            Socket connectionSocket = serversocket.accept();
            BufferedReader INPUT = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream OUTPUT = new DataOutputStream(connectionSocket.getOutputStream());
            clientSorov = INPUT.readLine();
            System.out.println("Quyidagilar qabul qilindi: " + clientSorov);
            String[] values = clientSorov.split(",");
            ArrayList<Float> value = new ArrayList<>();
            for (String item: values) {
                value.add(Float.parseFloat(item));
            }
            serverJavob1 = Yuza(value.get(0),+value.get(1))+"";
            serverJavob2 = Peremetr(value.get(0),+value.get(1))+"";
            OUTPUT.writeBytes(serverJavob1+"\n");
            OUTPUT.writeBytes(serverJavob2+"\n");
            System.out.println("Yuborildi: " + serverJavob1 +" va " + serverJavob2);
        }
    }
}
