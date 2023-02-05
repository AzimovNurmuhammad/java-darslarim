package com.company.Grafik_Muhit.Asosiy_Oynani_Yaratish;

import javax.swing.*;

public class Asosiy {
    public static void main(String[] args){
        Oyna_Methods oyna = new Oyna_Methods();
        oyna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
oyna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); bu oynani yopishda
ishlatiladigan x tugmasini yaratadi
         */

        oyna.setSize(350, 550);
        oyna.setLocation(200, 200);
        oyna.setVisible(true);
    }
}
