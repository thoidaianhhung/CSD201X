package com.company;

public class HeapSort {

    public HeapSort() {}

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void buildMaxHeap(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[(i - 1) / 2]) {
                int j = i;
                while (arr[j] > arr[(j - 1) / 2]) {
                    swap(arr, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }

    public void heapSort(int[] arr, int n) {
        buildMaxHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, i, 0);
            int j = 0, index;
            do {
                index = 2 * j + 1;
                if (index < i - 1 && arr[index] < arr[index + 1]) {
                    index++;
                }
                if (index < i && arr[j] < arr[index]) {
                    swap(arr, j, index);
                }
                j = index;

            } while (index < i);
        }
    }

    public void displayHeap(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
