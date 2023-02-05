package leedcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Concatenation_of_Array_1929_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Integer> nums = new ArrayList<>();
        int n = input.nextInt();
        int x = n;
        while (n != 0){
            int a = input.nextInt();
            nums.add(a);
            n-=1;
        }
        int i = 0;
        while ( i < x){
            nums.add(nums.get(i));
            i++ ;
        }
        System.out.println(nums);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.printf("How many numbers do you want to enter: ");
//        int n  = scanner.nextInt();
//
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n & n > 0 ; i++) {
//            nums[i] = scanner.nextInt();
//        }

/**/

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = input.nextInt();
//        }
//        System.out.println(nums[0]);

/**/

//        int ans[] = new int[2*n];
//        int k = 0;
//        for (int j = n; j < 2*n & n > 0; j++) {
//            nums[j] = nums[k];
//            k++ ;
//        }
//        for (int i = 0; i< nums.length; i++) {
//            System.out.printf(nums[i]+" ");
//        }
    }
}
