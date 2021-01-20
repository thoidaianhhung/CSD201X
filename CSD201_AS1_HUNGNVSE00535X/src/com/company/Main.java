package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  the sort and search on a real number application.");
        System.out.println();
        Algorithm algorithm = new Algorithm();
        while (true) {
            System.out.println("+-------------------Menu------------------+");
            System.out.println("1. Input");
            System.out.println("2. Output");
            System.out.println("3. Bubble sort");
            System.out.println("4. Selection sort");
            System.out.println("5. Insertion sort");
            System.out.println("6. Search > value");
            System.out.println("7. Search = value");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice = 0;

            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 7) {
                        break;
                    }
                    System.out.print("Your choice: ");
                }
                else {
                    System.out.println("Your choice: ");
                    input.nextLine();
                }
            }

            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }

            switch (choice) {
                case 1:
                    algorithm.writeFile();
                    break;
                case 2:
                    algorithm.readFile();
                    break;
                case 3:
                    algorithm.bubbleSort();
                    break;
                case 4:
                    algorithm.selectionSort();
                    break;
                case 5:
                    algorithm.insertionSort();
                    break;
                case 6:
                    algorithm.search();
                    break;
                case 7:
                    algorithm.binarySearch();
                    break;
                case 8:
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
            }
        }
    }
}
