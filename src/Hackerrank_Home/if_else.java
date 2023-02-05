// package Hackerrank_Home;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner raqam= new Scanner(System.in);

        int num = raqam.nextInt();

        if ( num >= 1 && num < 2){
            if (num % 2 == 1){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        } else if ( num >= 2 && num <= 5){
            if (num % 2 == 1){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        } else if (num >= 6 && num <= 20){
            if (num % 2 == 1){
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }

        } else if ( num >= 21 && num <= 100 ){
            if (num % 2 == 1){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("100 dan katta raqam kiritdingiz. ");
        }

    }
}
