package masala;
import java.util.Scanner;
public class Ismoil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Ixtiyoriy n ta sonning o‘rta geometrigini hisoblash
        String matn = input.nextLine();
        int n = matn.length();
        int[]a = new int[n];
        for(int i=0;i<0;i++){
            a[i] = input.nextInt();
        }
        int b = 1 ;
        for(int i = 0; i < n; i++){
            b *= a[i];
        }
        float d = (float) Math.pow(b, (float)1/n);
        System.out.println(d);
    }

}
