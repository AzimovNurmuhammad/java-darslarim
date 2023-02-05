package Project;

import java.util.Random;
import java.util.Scanner;
//import java.util.HashMap;

public class Raqamni_Taxmin_Qilish_Uyini {

    public static void main(String[] args){
        Random myrandom = new Random();
        Scanner scan = new Scanner(System.in);
        int random = 1 + myrandom.nextInt(20);
        int i = 0;
        int a = 5;

        while(i < 5){
            int scanner = scan.nextInt();
            if (scanner == random){
                System.out.println("Siz "+ random + " raqamini topdingiz. \uD83D\uDC4C");
                break;
            } else if(scanner < random){
                System.out.println("Afsus siz tanlangan raqandan kichikroq raqam kiritdingiz. " +
                        (a-1) + " ta urinishingiz qoldi");
            } else {
                System.out.println("Afsus siz tanlangan raqandan kattaroq raqam kiritdingiz. " +
                        (a-1) + " ta urinishingiz qoldi");
            }
            i++ ;
            a-- ;
        }
    }

}

