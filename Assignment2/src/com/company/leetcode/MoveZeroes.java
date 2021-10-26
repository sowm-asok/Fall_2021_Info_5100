package com.company.leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0};
//        int[] nums = {1, 2, 0, 5, 4, 0, 0, 2};
//        int[] nums = {3, 2, 0, 4, 7, 0};

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int temp;
        int left = 0;
        int right = left + 1;

        while (right < nums.length) {
            if (nums[left] != 0) {
                left++;
                right++;
            } else if (nums[left] == 0 && nums[right] != 0) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            } else if (nums[left] == 0 && nums[right] == 0) {
                right++;
            }
        }
    }
}
