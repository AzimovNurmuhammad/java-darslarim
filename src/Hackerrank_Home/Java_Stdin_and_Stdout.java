// package Hackerrank_Home;

import java.lang.String;
import java.util.*;
import java.util.Scanner;
public class Java_Stdin_and_Stdout {
    public static void main(String[] args){



        Scanner name = new Scanner(System.in);
        String str = name.nextLine();
        int num = name.nextInt();
        double num2 = name.nextDouble();



        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num);
    }
}
