package com.company;

public class SimpleSort {
    int[] a;
    int n;

    SimpleSort (int[] b) {
        n = b.length;
        a = new int [n];
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

    public void selectionSort() {
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min_index] > a[j]) {
                    min_index = j;
                }
            }
            swap(i, min_index);
        }
    }

    public void insertSort() {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j -1;
            }
            a[j + 1] = key;
        }
    }

    public void search(int value) {
        for (int i = 0; i < n; i++) {
            if (a[i] == value) {
                System.out.println("Search(11): " + i);
            }
        }
    }
}
