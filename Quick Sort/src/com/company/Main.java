package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        quickSort.printArray(arr);
    }
}
