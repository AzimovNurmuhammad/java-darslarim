

import java.util.Scanner;
public class tub_son2 {

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        int chegara = num.nextInt();
        boolean tub;

        int i = 2;
        while ( i<= chegara ){
            tub = true;

            int j = 2;
            while ( j < i ){
                if(i % j == 0){
                    tub = false;
                    break;

                }
                j++ ;
            }
            if(tub)
                System.out.printf("%d, ", i);
            i++ ;
        }

    }
}
