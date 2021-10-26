package com.company;

import java.util.HashMap;

public class Question1 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2};
//        int[] nums = new int[]{1, 1, 1, 1, 1};
//        int[] nums = new int[]{1, 2, 3, 4, 5};
        int result = sumOfUnique(nums);
        System.out.println(result);
    }

    private static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> uniqueTable = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int num : nums) {
            if (uniqueTable.containsKey(num)) {
                uniqueTable.put(num, uniqueTable.get(num) + 1);
            } else {
                uniqueTable.put(num, 1);
            }
        }
        for (int key : uniqueTable.keySet()) { // add the keys whose value is 1
            if (uniqueTable.get(key) == 1) {
                sum += key;
            }
        }
        return sum;
    }
}
