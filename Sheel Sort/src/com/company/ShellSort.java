package com.company;

public class ShellSort {
    int[] a;
    int n;

    public ShellSort(int[] b) {
        n = b.length;
        a = new int[n];
        System.arraycopy(b, 0, a, 0, n);
    }

    public void displayArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public void insertSort(int h) {
        int i, j, x;
        for (i = h; i < n; i++) {
            x = a[i];
            j = i;
            while (j - h >= 0 && x < a[j - h]) {
                a[j] = a[j - h];
                j = j - h;
            }
            a[j] = x;
        }
        displayArray();
    }

    public void shellSort(int[] step) {
        int i, h, number;
        number = step.length;
        for (i = 0; i < number; i++) {
            h = step[i];
            insertSort(h);
        }
    }

    public void shellSort() {
        int[] step = {5, 3, 1};
        shellSort(step);
    }
}
