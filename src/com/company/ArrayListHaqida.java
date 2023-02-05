// package com.company;

import java.util.ArrayList;
public class ArrayListHaqida {
    public static void main(String[] args){
        ArrayList < String > elementlar = new ArrayList<String>();
        /*
           ArrayList dan so'ng massiv type( turin i ) kiritdik  undan so'ng massiv nomini kiritdik
         va bir barobardan so'ng ochgan yangi massivdi elon qildik
         */

        elementlar.add("qizil"); // ro'yxatga element qushish
        elementlar.add(0, "sariq");
        // 0- indexga qiymat kiritildi

        System.out.println(elementlar);

// Sikl yordamida massiv elementlarini kursatamiz.


        for(int i = 0; i < elementlar.size(); i++){
            System.out.printf(" %s", elementlar.get(i));
            System.out.println("");
        }


        elementlar.add("yashil");
        elementlar.add("sariq");
        System.out.println(elementlar);

// quyigadi ishimiz remove(methods) mtod urniga massiv elementni va indexini quyishimiz mumkin.
        // bunda 1 uchragan va metodga teng bulgan elementni uchiradi
        elementlar.remove("sariq");
        System.out.println(elementlar);
        System.out.println("");


        System.out.printf("\"qizil\" %sro'yxatda \n", elementlar.contains("qizil")?"":"yo'q");
/*
    Bu yerda contains massiv elementlari ichidan qizil elementi bor yoki yuqligini tekshirdi.
    Va biz bu yerda sout ichida shart tekshirishni kurdik

*/
    }
}
