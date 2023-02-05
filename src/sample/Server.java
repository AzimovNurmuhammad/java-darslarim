//package sample;
//
//import java.rmi.*;
//import java.rmi.registry.LocateRegistry;
//import java.util.Scanner;
//
//public class Server {
//
//    public static void main(String[] args) throws Exception{
//
//        Client chat = new Client();
//
//        String navn = "Chat";
//
//        LocateRegistry.createRegistry(1099);
//        Naming.rebind(navn, (Remote) chat);
//        String filename = "Ciphertest2.txt";
//        Object OTPGen = null;
////        System.out.println(null);
//
//        String input = "";
//        Scanner leserFraKommandovindu = new Scanner(System.in);
//        System.out.println("Server ishga tushdi, RMI soket bog'landi...");
//        System.out.println(leserFraKommandovindu.nextLine());
//        Naming.unbind(navn);
//        System.exit(0); }}
