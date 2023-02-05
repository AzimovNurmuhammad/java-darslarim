package dars_48;

public class dars {
    public static void main(String[] args){

        dars_final obekt = new dars_final(10);

        for(int i = 0; i < 5; i++){
            obekt.orttir();
            System.out.println(obekt);
        }
    }
}
