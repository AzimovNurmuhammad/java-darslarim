public class dars_46_Enumiration {
    enum Kun {Dushanba, Seshanba, Chorshanba, Payshanba, Juma, Shanba, Yakshanba};
/* 
    Bunda biz tipga uxshagan Kun degan element yaratdik
    kundi biz harxil nomlashimiz va harxil qiymat kiritishimiz mumkun
*/  
    public static void main(String[] args) {
        Kun kecha = Kun.Dushanba;
        Kun bugun = Kun.Seshanba;
        Kun ertaga = Kun.Chorshanba;

        System.out.println("kecha kun" + kecha + "edi");
        System.out.println("bugun kun" + bugun + "edi");
        System.out.println("ertaga kun" + ertaga + "edi");
    }
}
