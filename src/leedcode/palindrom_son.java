package leedcode;

import java.util.ArrayList;
import java.util.Scanner;
public class palindrom_son {
    public static void main(String[] args){
        Scanner raqam = new Scanner(System.in);
//        ArrayList list = new ArrayList();
//
//        int num = raqam.nextInt(), qoldiq;
//
//        while (true){
//            qoldiq = num % 10;
//            list.add(qoldiq);
//            if(qoldiq == 0)
//                break;
//
//            num /= 10;
//            if(num == 0){
//                break;
//            }
//        }
//
//        System.out.println(list);
//
//        int i = 0;
//        int []massiv = list;
//

        int r,sum=0,temp;
        int n=454;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");


    }
}
