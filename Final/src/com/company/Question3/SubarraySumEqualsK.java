package com.company.Question3;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1};
//        int count = subarraySum(nums, 2);

        int[] nums = {1, 2, 3};
        int count = subarraySum(nums, 3);
        System.out.println(count);
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
