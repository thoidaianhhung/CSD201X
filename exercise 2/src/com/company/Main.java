package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);
        int choice;
        int[] b = {5,7,11,3,9,2,6};
        SimpleSort t = new SimpleSort(b);
        while (true) {
            System.out.println("Choose your option:");
            System.out.println("1. Display array.");
            System.out.println("2. Selection Sort.");
            System.out.println("3. Insertion Sort.");
            System.out.println("4. Search");
            System.out.println("0. Exit");
            System.out.println("Your selection (0 -> 4)");
            choice = Integer.parseInt(input.nextLine());
            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }

            switch (choice) {
                case 1:
                    t.display();
                    break;
                case 2:
                    t.selectionSort();
                    t.display();
                    break;
                case 3:
                    t.insertSort();
                    t.display();
                    break;
                case 4:
                    t.search(11);
                    t.display();
                    break;
                default:
                    System.out.println("** Invalid choice. Try again **");
            }
        }
    }
}
