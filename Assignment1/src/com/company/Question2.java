package com.company;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Question2 {

    public static void main(String[] args) {
        int[] nums = new int[]{-4, 0, 1, 10};
//        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));

    }

    private static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int arr[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (abs(nums[left]) > abs(nums[right])) {
                arr[i] = nums[left] * nums[left];
                left++;
            } else {
                arr[i] = nums[right] * nums[right];
                right--;
            }
        }
        return arr;
    }
}
