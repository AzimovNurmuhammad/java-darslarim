
import java.util.Scanner;
public class vazifa111 {

//    1-topshiriq
//    a va b nomli o'zgaruvchisini e'lon qiling (istalgan integer qiymati bilan). Ularning yig'indisini
//    ekranga chiqaring.

    public static void main (String args[]){
        Scanner butun = new Scanner(System.in);
        int a, b;
        System.out.print("a ga qiymat kiriting: "); a = butun.nextInt();
        System.out.print("b ga qiymat kiriting: "); b = butun.nextInt();

        System.out.println("a + b = " + (a + b));
    }
}
