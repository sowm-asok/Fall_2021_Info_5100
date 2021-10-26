package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        List<Integer> result = spiralOrder(matrix);
        // Print result
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i == result.size() - 1) {
                System.out.print("]");
            } else {
                System.out.print(",");
            }
        }
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        int top = 0; // For rows
        int bottom = matrix.length - 1; // Row size
        int left = 0; // For columns
        int right = matrix[0].length - 1; // Column size

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++; // Bringing the boundary closer

            // Check for condition after inner boundary left -> right
            if (!(top <= bottom && left <= right)) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--; // Bringing the boundary closer

            // Check for condition after inner boundary top -> bottom
            if (!(top <= bottom && left <= right)) {
                break;
            }

            for (int i = right; i >= left; i--) {
                spiral.add(matrix[bottom][i]);
            }
            bottom--; // Bringing the boundary closer

            for (int i = bottom; i >= top; i--) {
                spiral.add(matrix[i][left]);
            }
            left++; // Bringing the boundary closer

        }
        return spiral;
    }
}
