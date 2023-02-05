package leedcode;

import java.util.Scanner;

public class Shuffle_the_Array_1470 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n*2];
        int res[] = new int[nums.length];

        for (int i = 0; i < 2*n; i++) {
            nums[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            res[2*i] = nums[i];
            res[2*i + 1] = nums[n+i];
        }

        for (int j = 0; j < 2*n; j++) {
            System.out.println(nums[j]);
        }

    }
}
