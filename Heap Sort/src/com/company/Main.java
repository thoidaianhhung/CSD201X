package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {10, 20, 15, 17, 9, 21};
        System.out.println("Given array:");
        HeapSort heapSort = new HeapSort();
        heapSort.displayHeap(arr);

        System.out.println("Sort array:");
        heapSort.heapSort(arr, arr.length);
        heapSort.displayHeap(arr);
    }
}
