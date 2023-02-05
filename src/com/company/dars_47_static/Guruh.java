package dars_47_static;

public class Guruh {
    private String ismi;
    private String sharfi;

    public static int miqdori = 0;

    public Guruh(String ism, String sharuf){
        ismi = ism;
        sharfi = sharuf;
        miqdori++ ;
    }
    public static int miqdori(){
        return miqdori ;
    }
}
