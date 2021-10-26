package com.company.leetcode;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int rowLength;
        int columnLength;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] transpose(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int[][] transpose = new int[columnLength][rowLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
