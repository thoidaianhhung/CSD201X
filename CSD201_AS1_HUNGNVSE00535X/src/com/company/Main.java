package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  the sort and search on a real number application.");
        System.out.println();
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
            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 1 && choice <= 7) {
                        break;
                    }
                    System.out.print("Your choice: ");
                }
                else {
                    System.out.println("Your choice: ");
                    input.nextLine();
                }
            }
            switch (choice) {

            }
        }
    }
}
