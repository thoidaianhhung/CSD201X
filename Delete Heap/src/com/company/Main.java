package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5, 3, 2, 4, 10};
        int n = arr.length;
        DeleteHeap deleteHeap = new DeleteHeap();

        n = deleteHeap.deleteRoot(arr, n);
        deleteHeap.displayArray(arr, n);
    }
}
