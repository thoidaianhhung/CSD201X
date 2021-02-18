package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] b = {7,3,5,9,11,8,6,15,10,12,14};
        ShellSort shellSort = new ShellSort(b);
        shellSort.displayArray();
        System.out.println();
        shellSort.shellSort();
        System.out.println("Shell Sort:");
        shellSort.displayArray();
    }
}
