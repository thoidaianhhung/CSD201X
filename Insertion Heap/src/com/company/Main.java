package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {100, 19, 36, 17, 3, 25, 1, 2, 7};
        int n = 9;
        int key = 4;
        InsertionHeap insertionHeap = new InsertionHeap();
        insertionHeap.displayHeap(insertionHeap.insertionHeap(arr, n, key));
    }
}
