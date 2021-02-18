package com.company;

import java.util.List;

public class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int rightDiagonal = 0;
        int leftDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    rightDiagonal += arr.get(i).get(j);
                    System.out.print("rightDiagonal ");
                    System.out.print(arr.get(i).get(j) + " + ");
                }

                if (i + j == n - 1) {
                    leftDiagonal += arr.get(i).get(j);
                    System.out.print("leftDiagonal ");
                    System.out.print(arr.get(i).get(j) + " + ");
                }
            }
        }
        return Math.abs(rightDiagonal - leftDiagonal);

    }
}
