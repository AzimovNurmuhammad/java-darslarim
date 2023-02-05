package com.company.Fayl;

import java.io.File;
public class faylBorYokiYuqliginiTekshirish {
    public static void main(String[] args){
        File faylim = new File("D:\\fayl.txt");

        if (faylim.exists()){
            System.out.println(faylim.getName() + " movjud");
        } else {
            System.out.println("Fayl movjud emas.");
        }
    }


}
