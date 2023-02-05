// package Hackerrank_Home;


import java.lang.Math;
import java.util.Scanner;
public class loop2_hackerrank {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        int q = num.nextInt();
        for(int x = 1; x <= q; x++){
            int a = num.nextInt(),b = num.nextInt(), n = num.nextInt();
            double c ;
            for(int i = 0; i <= n-1; i++){
                c = Math.pow(2, i) * b;
                a += c;
                System.out.print( a + " ");
            }
            System.out.println("");
        }
    }
}
