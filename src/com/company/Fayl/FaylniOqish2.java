package com.company.Fayl;

import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class FaylniOqish2 {
    private Scanner fayl;

    public void faylOchish(){
        try {
            fayl = new Scanner(new File("FaylOchildi.txt"));
            System.out.println("\nFayl ocholdi");
        } catch (Exception e){
            System.out.println("fayl ochida muammo yuzaga kelgan. ");
        }
    }

    public void faylOqish(){
        while (fayl.hasNextInt()){
            String qator = fayl.nextLine();
            System.out.println(qator);
        }
    }

    public void faylYop(){
        fayl.close();
    }
}
