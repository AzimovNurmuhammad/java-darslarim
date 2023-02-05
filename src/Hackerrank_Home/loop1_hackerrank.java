package Hackerrank_Home;
import java.util.Scanner;
public class loop1_hackerrank {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt(), result;
        for(int i = 1; i <= 10; i++){
            result = num1 * i;
            System.out.printf("%d x %d = %d",num1,i,result); System.out.println("");
        }
    }
}
