package com.company;

public class SimpleSort {
    int[] a;
    int n;

    SimpleSort(int[] b) {
        n = b.length;
        a = new int[n];
        System.arraycopy(b, 0, a, 0, n);
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public void swap(int i, int k) {
        int x;
        x = a[i];
        a[i] = a[k];
        a[k] = x;
    }

    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i- 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
            display();
        }
    }
}
