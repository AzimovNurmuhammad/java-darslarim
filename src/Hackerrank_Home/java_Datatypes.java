// package Hackerrank_Home;

import java.util.Scanner;
public class java_Datatypes {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        int soni = num.nextInt();

        for(int i = 1; i <= soni; i++ ){
            Long a = num.nextLong();
            if(a >= -32768 && a <= 32767){

                System.out.printf("%d can be fitted in: ",a + "\n" + "* short\n" +
                        "* int\n" +
                        "* long");
                System.out.println("");

            } else if(a >= -2147483648 && a <= 2147483647){

                System.out.printf("%d can be fitted in:",a + "* int\n" +
                        "* long");
                System.out.println("");

            } else if(a >= -2147483648 && a <= 2147483647){

                System.out.printf("%d can be fitted in:",a + "\n* long");
                System.out.println("");

            }
        }
    }
}
