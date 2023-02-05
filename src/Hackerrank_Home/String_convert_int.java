// package Hackerrank_Home;

import java.util.Scanner;
public class String_convert_int {
    public static void main(String[] args){

        Scanner type = new Scanner(System.in);

        String name = type.nextLine();

        int num;

// Integer.valueOf(name) yoki Integer.parseInt(name) metodlardan biri bilan String turidagi uzgaruvchini
//        int turiga uzgartirdik
        num = Integer.valueOf(name);
        System.out.println( num );
    }
}
