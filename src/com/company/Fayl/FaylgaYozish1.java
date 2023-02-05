package com.company.Fayl;

import java.util.Formatter;

public class FaylgaYozish1 {
    private Formatter fayl;

    public void faylOchish() {
        try {
            fayl = new Formatter("D:\\FaylOchildi.txt");
            System.out.println("Fayl ochildi");
        } catch (Exception e){
            System.out.println(e + "\nfayl ochilmadi.");
        }
    }
    public void faylgaYozish(){
        fayl.format("%s", "fayldi ichiga yozilgan matn");
    }

    public void fayldYopish(){
        fayl.close();
    }
}
