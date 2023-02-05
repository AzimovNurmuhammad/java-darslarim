package dars_47_static;

public class Guruh1 {
    public static void main( String[] args) {
        Guruh talaba1 = new Guruh("Abdulla", "Salimov");
        Guruh talaba2 = new Guruh("Asror", "Soatov");
        Guruh talaba3 = new Guruh("Aziz", "Abdiyev");
        Guruh talaba4 = new Guruh("Azim", "Bohodirov");
        Guruh talaba5 = new Guruh("Nurmuhammad", "Azimov");

        System.out.printf("Guruhdagi talabalar %d ta", Guruh.miqdori());
        // System.out.printf(format, args);

    }
    
}
