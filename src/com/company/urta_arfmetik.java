

import java.util.Scanner;
public class urta_arfmetik {
    public static void main(String[] args){

        Scanner soni = new Scanner(System.in);

        /* Biz baliqlar o'rtacha vaznini topamiz*/
        int baliqlar_soni = soni.nextInt();
        double urtacha_vazni, vazinlar_yigindisi = 0;

        int i = 1;
        while(i <= baliqlar_soni){
            int baliq_vazni = soni.nextInt();
            vazinlar_yigindisi += baliq_vazni;
            i++ ;
        }
        urtacha_vazni = vazinlar_yigindisi / baliqlar_soni;
        System.out.println(urtacha_vazni);


    }
}
