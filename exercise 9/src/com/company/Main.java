package com.company;

import java.util.Scanner;

public class Main {

    public static int[] b;

    public static void inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Import n element: ");
        int n = Integer.parseInt(input.nextLine());
        b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(input.nextLine());
        }
    }
    public static void showMenu() {
        System.out.println("1. Import Data.");
        System.out.println("2. Sort");
        System.out.println("3. Display array.");
    }

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);
        QuickSort quickSort = new QuickSort();

        while (true) {
            showMenu();
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 -> {
                    inputArray();
                    quickSort.setArray(b);
                }
                case 2 -> quickSort.quickSort(0, b.length - 1);
                case 3 -> quickSort.displayArray();
                case 4 -> System.exit(0);
            }
        }

    }
}
