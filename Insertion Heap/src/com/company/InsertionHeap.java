package com.company;

import java.awt.*;

public class InsertionHeap {
    int[] b;

    public InsertionHeap() {}

    public void heapify(int[] arr, int n, int i) {
        int parent = (i - 1) / 2;

        if (arr[parent] > 0) {
            if (arr[i] > arr[parent]) {
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;

                heapify(arr, n, parent);
            }
        }
    }

    public int insertionHeap(int[] arr, int n, int key) {
        n = n + 1;
        b = new int[n];

        System.arraycopy(arr, 0, b, 0 ,n - 1);
        b[n - 1] = key;
        heapify(b, n, n - 1);
        return n;
    }

    public void displayHeap(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
