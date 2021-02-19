package com.company;


public class Result {
    public void plusMinus(int[] arr) {
        int n = arr.length;
        float positive = 0, negative = 0, zero = 0;
        for (int j : arr) {
            if (j > 0) {
                positive++;
            }
            if (j == 0) {
                zero++;
            }
            if (j < 0) {
                negative++;
            }
        }
        System.out.printf("%6f\n", positive / n);
        System.out.printf("%6f\n", negative / n);
        System.out.printf("%6f\n", zero / n);
    }
}
