package dars_48;

public class dars_final {
    private int natija;
    private final int ORTTIRMA; 

    public dars_final(int orttirish){
        ORTTIRMA = orttirish;
    }
    public void orttir(){
        natija += ORTTIRMA;
    }
    public String toString(){
        return String.format("natija = ", natija);
    }
}
