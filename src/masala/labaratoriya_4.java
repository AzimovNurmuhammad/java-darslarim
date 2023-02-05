package masala;

import java.io.*;
import java.net.*;
import java.util.ArrayList;


public class labaratoriya_4 {
    static float  Bikvadrat(float x)
    {
        return (x*x*x*x);
    }

    public static void main(String[] args) throws Exception
    {
        String clientSorov;
        String serverJavob1;
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
            serverJavob1 = Bikvadrat(value.get(0))+"";
            OUTPUT.writeBytes(serverJavob1+"\n");
            System.out.println("Yuborildi: " + serverJavob1);
        }
    }

}
