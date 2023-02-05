package com.company.recursiya;

public class Recursiya {
    public static void main(String[] args){
        System.out.println(faktorial(4));
    }

    public static int faktorial(int raqam){
        if(raqam < 1)
            return 1;
        else
            return raqam * faktorial(raqam-1);
    }
}
