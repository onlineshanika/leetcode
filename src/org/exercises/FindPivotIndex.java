package org.exercises;

import java.util.stream.IntStream;

public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
    }

    public static int pivotIndex(int[] nums) {
        if( nums.length  == 1) return 0;
        int leftSum = 0;
        int sum =  0;
        for (int num : nums) sum += num;

        for (int i = 0; i < nums.length; i++) {
             if (sum - leftSum - nums[i] == leftSum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
