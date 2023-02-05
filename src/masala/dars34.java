

public class dars34 {

    public static void main(String[] args) {
        
        int massiv[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        uzgartirish(massiv);

        for(int y: massiv)
            System.out.println(y);
    }

    public static void uzgartirish(int x[]) {
        for(int sanoq = 0; sanoq < x.length; sanoq++)
        x[sanoq] += 5;
    }

    
}

