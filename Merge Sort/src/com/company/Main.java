package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] b = {7,3,5,9,11,8,6,15,10,12,14};
        int n = b.length;
        MergeSort mergeSort = new MergeSort(b);
        mergeSort.mergeSort(0, n -1);
        mergeSort.displayArray();
    }
}
