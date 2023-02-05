

import java.util.Scanner;
public class tub_son {

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        int chegara = num.nextInt();
        boolean tub;

        for(int i = 2; i <= chegara; i++){
            tub = true;

            for(int j = 2; j < i; j++){
                if( i % j == 0){
                    tub = false;
                    break;
                }
            }
//            int j = 2;
//
//            while (j < i) {
//                if (i % j == 0) {
//                    tub = false;
//                    break;
//                }
//                j++ ;
//            }
            if(tub)
                System.out.printf("%d, ",i);

        }

    }

}
