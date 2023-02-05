package Hackerrank_Home;

import java.util.Scanner;

public class Int_to_String {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = String.valueOf(n);
        s += 0;
        int a = Integer.valueOf(s);
        if(a != n || n == 0){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        }
    }
