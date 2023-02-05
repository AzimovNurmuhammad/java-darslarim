package com.company.Fayl;

import java.util.*;
public class FaylOchish {
    public static void main(String[] args){
        final Formatter x;

        try {
            x = new Formatter("D:\\FaylOch1.txt");
            System.out.println("Fayl ochildi");
        } catch (Exception e){
            System.out.println(e + "\nFayl ochilmadi");
        }
    }
}
