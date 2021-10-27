package com.company.Question3;

import java.util.HashMap;

public class Question3 {

    public static void main(String[] args) {
        int[] array = {1, 3, -1, 3, 4, -1}; // Output is 2
//        int[] array = {1, 3, -1, 3, 4, -1, 4}; // Output is 6
//        int[] array = {1, 3, -1, 3, 4, -1, -2, -2}; // Output is 0
        int result = findSumOfRepeatedNumbers(array);
        System.out.println(result);
    }

    private static int findSumOfRepeatedNumbers(int[] array) {
        int repeatSum = 0;
        HashMap<Integer, Integer> repeatTable = new HashMap<>();
        for (int num : array) {
            if (repeatTable.containsKey(num)) {
                repeatTable.put(num, repeatTable.get(num) + 1);
            } else {
                repeatTable.put(num, 1);
            }
        }

        for (int num : repeatTable.keySet()) {
            if (repeatTable.get(num) > 1) {
                repeatSum += num;
            }
        }
        return repeatSum;
    }
}
