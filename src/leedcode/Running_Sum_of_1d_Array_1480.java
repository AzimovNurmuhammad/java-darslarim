package leedcode;

public class Running_Sum_of_1d_Array_1480 {
    public static int[] runningSum(int[] nums) {
        final int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            nums[i] = sum;
        }
        return nums;
    }
}