

import java.util.Scanner;
public class vazifa112 {
//    2-topshiriq
//    a, b va c nomli o'zgaruvchisini e'lon qiling (istalgan integer qiymati bilan).
//    Ularning o'rta arifmetigini ekranga chiqaring va o'rta arifmetik qanday
//    hisoblangaligi haqida komment yozing
    public static void main(String args[]){

        Scanner integer = new Scanner(System.in);

        int a, b, c;

        System.out.print("a ba qiymat kiriting: "); a = integer.nextInt();
        System.out.print("b ba qiymat kiriting: "); b = integer.nextInt();
        System.out.print("c ba qiymat kiriting: "); c = integer.nextInt();

        System.out.println("(a+b+c)/3 = "+ ((a+b+c)/3));

    }
}
