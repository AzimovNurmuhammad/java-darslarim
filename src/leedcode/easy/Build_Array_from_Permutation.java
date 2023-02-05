//package leedcode.easy;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//public class Build_Array_from_Permutation {
//    public  void main(String[] args){
//        Scanner num = new Scanner(System.in);
//        int n;
//        n = num.nextInt();
//        int  nums[] = num.nextInt;
//        int [] ans;
//
//        for(int i = 0; i < nums.length; i++){
//            ans[i] = nums[nums[i]];
//        }
//        System.out.println(ans);
//    }
//
//}
//// class Solution {
////     public int[] buildArray(int[] nums) {
////         int n = nums.length;
////         for(int i=0;i<n;i++){
////             nums[i]=n*(nums[nums[i]]%n)+nums[i];
////         }
////         for(int i=0;i<n;i++){
////             nums[i]=nums[i]/n;
////         }
////         return nums;
////     }
////     }