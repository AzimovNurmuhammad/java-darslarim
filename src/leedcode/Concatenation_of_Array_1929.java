package leedcode;

import java.util.ArrayList;
import java.util.Scanner;
public class Concatenation_of_Array_1929 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
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
    }
}
/*
class Solution {
  public int[] getConcatenation(int[] nums) {
    final int n = nums.length;

    int[] ans = new int[n * 2];

    for (int i = 0; i < n; ++i)
      ans[i] = ans[i + n] = nums[i];

    return ans;
  }
}

leedcode solution
 */