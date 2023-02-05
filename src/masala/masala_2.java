// package masalalar;

import java.util.Scanner;
public class masala_2 {
    public static void main(String[] args){
        Scanner  raqam = new Scanner(System.in);

        int r1 =  raqam.nextInt(), r2 =  raqam.nextInt(), r3 =  raqam.nextInt();
        double S1, S2, S3;
        int r12, r22, r32;
        r12 = r1 * r1;
        r22 = r2 * r2;
        r32 = r3 * r3;

        S1 = 3.14 * r12;
        S2 = 3.14 * r22;
        S3 = 3.14 * r32;

        System.out.println(S1 + " " + S2 + " " + S3);
    }
}
