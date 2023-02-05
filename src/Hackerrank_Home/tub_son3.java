// package Hackerrank_Home;

import java.util.Scanner;
public class tub_son3 {

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        int chegara = num.nextInt();

        tashqiSikl:

        for ( int i = 2; i <= chegara; i++){

            for (int j = 2; j <= i; j++){

                if( i % j == 0) continue tashqiSikl;

            }
            System.out.printf("%d, ",i);

        }

    }

}
