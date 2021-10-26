package com.company;

import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 2, 3, 5, 7};
//        int[] arr = {2, 3, 4, 4, 2, 2, 3, 5, 5, 7, 7};  //Negative case: returns -1
        int result = nonRepeatingInteger(arr);
        System.out.println(result);
    }

    private static int nonRepeatingInteger(int[] arr) {
        HashMap<Integer, Integer> repeatTable = new HashMap<Integer, Integer>();
        for (int num : arr) {
            if (repeatTable.containsKey(num)) {
                repeatTable.put(num, repeatTable.get(num) + 1);
            } else {
                repeatTable.put(num, 1);
            }
        }
        for (int n : arr) {
            if (repeatTable.get(n) == 1) {
                return n;
            }
        }
        return -1;
    }
}
