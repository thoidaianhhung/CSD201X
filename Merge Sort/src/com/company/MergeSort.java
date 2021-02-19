package com.company;

public class MergeSort {
    int[] a;
    int n;

    public MergeSort(int[] b) {
        int n = b.length;
        a = new int[n];
        System.arraycopy(b, 0, a, 0 , n);
    }

    public void displayArray() {
        for (int i : a) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public void mergeSort(int p, int r) {
        if (r > p) {
            int mid = (p + r) / 2;
            mergeSort(p , mid);
            mergeSort(mid + 1, r);
            merge(p, mid, r);
        }
    }

    public void merge(int p, int mid, int r) {
        int i, j, k , x, n;
        n = r - p + 1;
        int[] b = new int[n];
        i = p; j = mid + 1; k = 0;
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        while (i <= mid) {
            b[k++] = a[i++];
        }
        while (j <= r) {
            b[k++] = a[j++];
        }
        k = 0;
        for (i = p; i <= r; i++) {
            a[i] = b[k++];
        }
    }
}
