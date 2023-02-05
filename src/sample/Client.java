//package sample;
//import java.rmi.Naming;
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Client {
//    static String username = "PayUmoney";
//    public static boolean encryption = true;
//    private static int latestMessage = 0;
//    private static String[] cipher;
//
//    public static <ClientInputThread> void main(String[] args) throws Exception {
//        String url = "rmi://localhost/Chat";
//        String input = "";
//        Scanner leserFraKommandovindu = new Scanner(System.in);
//        System.out.println("RMI chat xizmatiga xush kelibsiz!!!");
//        System.out.println("Marhamat, ismingizni kiriting...");
//        username = leserFraKommandovindu.nextLine();
//        System.out.println("Marhamat, hostname kiritlisin...?");
//        url = "rmi://" + leserFraKommandovindu.nextLine() + "/Chat";
//        System.out.println(url);
//        Chat chat = (Chat) Naming.lookup(url);
//
//        System.out.println(" OTP fayl nomi kiriting (blank for no encryption)");
//        String otpFile = leserFraKommandovindu.nextLine();
//        otpFile = "TestCipher"; // REMOVE AFTER TESTING
//        if (!otpFile.equals("")) {
//            cipher = OTPGen.readCleanFile(otpFile);
//            encryption = true;
//        }
//        ClientInputThread cit;
//        if (encryption) cit = new ClientInputThread(chat, leserFraKommandovindu, username, cipher);
//        else cit = new ClientInputThread(chat, leserFraKommandovindu, username);
//
//        cit.start();
//        while (true) {
//            Thread.sleep(500);
//            if (chat.checkNew(latestMessage)) {
//                ArrayList<String> messages = chat.getNew(latestMessage);
//                printMessages(messages);
//            }
//        }
//    }
//
//    private static void printMessages(ArrayList<String> messages) {
//        if (messages != null) {
//            for (String message : messages) {
//                if (!message.startsWith(username)) {
//                    String[] split = message.split(": ");
//                    //System.out.println(message);
//                    System.out.println(split[0] + ": " + OTPGen.decrypt(split[1],cipher[latestMessage]));
//                }
//                latestMessage++;
//            }
//        }
//    }
//}
