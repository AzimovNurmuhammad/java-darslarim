package masala;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class labaratoriya_4_clent {
    public static void main(String[] args) throws Exception
    {
        String sorov;
        String javob1;
        Socket clientSocket = new Socket("127.0.0.1", 5522);
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        Scanner input = new Scanner(System.in);
        System.out.println("\nistalgan musbat sonni kiriting:");
        System.out.print("x:");
        float x = input.nextFloat();
        if (x>=0)
        {
            sorov = x+","+x;
            outToServer.writeBytes(sorov += "\n");
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            javob1 = inFromServer.readLine();
            System.out.println("\nBikvadrati: " + javob1);
            clientSocket.close();
        }
        else
        {
            System.out.println("\nSon manfiy kiritilgan");
        }
    }

}
