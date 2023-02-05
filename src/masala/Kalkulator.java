package masala;

import java.util.Scanner;

public class Kalkulator {

    public double qoshish(double a, double b){
        return a+b;
    }

    public double ayirish(double a, double b){
        return a-b;
    }

    public double kupaytirish(double a, double b){
        return a*b;
    }

    public double bulish(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Kalkulator obj = new Kalkulator();

        while (true){
            double a = scan.nextFloat();
            String ishora = scan.next();
            double b = scan.nextFloat();

            if(ishora.equals("+")){
                System.out.println(obj.qoshish(a, b));
            } else if(ishora.equals("-")){
                System.out.println(obj.ayirish(a, b));
            } else if(ishora.equals("*")){
                System.out.println(obj.kupaytirish(a, b));
            } else if(ishora.equals("/")){
                System.out.println(obj.bulish(a, b));
            } else {
                System.out.println("+, -, *, /  belgilarini ishlating");
            }
        }


    }
}
