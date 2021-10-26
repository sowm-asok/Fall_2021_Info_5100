package com.company.leetcode;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
//        int[][] matrix = {{1}};
//        int[][] matrix = {{1, 2}, {3, 4}};

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void rotate(int[][] matrix) {
        int temp;
        int rowLength = matrix.length;

        // Get transpose of matrix
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (i > j) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // Get reverse of transposed matrix
        for (int i = 0; i < rowLength; i++) {
            int left = 0;
            int right = rowLength - 1;
            while (left < right) {
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}