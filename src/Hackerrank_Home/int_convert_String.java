// package Hackerrank_Home;

import java.util.Scanner;
public class int_convert_String {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String name;
// biz Stringning String.valueof(int i)  mtodidan foydalandik
        name = String.valueOf(num);
        System.out.println(name);
    }
}
