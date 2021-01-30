package com.company;

import java.util.Scanner;


/**
 * class to create the menu and perform functions in the OperationToProduct class of the problem
 */
public class Main {
    public static void showMenu() {
        System.out.println("Choose one of this options: ");
        System.out.println("Product list:");
        System.out.println("1. Load data from file and display.");
        System.out.println("2. Input & add to the end.");
        System.out.println("3. Display data.");
        System.out.println("4. Save product list to file.");
        System.out.println("5. Search by ID.");
        System.out.println("6. Delete by ID.");
        System.out.println("7. Sort by ID.");
        System.out.println("8. Convert to Binary.");
        System.out.println("9. Load to stack and display");
        System.out.println("10. Load to queue and display.");
        System.out.println("0. Exit.");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the product management application.");
        System.out.println();
        OperationToProduct operationToProduct = new OperationToProduct();
        while (true) {
            showMenu();
            System.out.print("Your choice: ");
            int choice = 0;

            // Check choice is integer, if not, re-enter
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 10) {
                        break;
                    }
                    System.out.print("Your choice: ");
                } else {
                    System.out.print("Your choice: ");
                    input.nextLine();
                }
            }
            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }

            switch (choice) {
                case 1 -> operationToProduct.getFileToLinkedList();
                case 2 -> operationToProduct.createProduct();
                case 3 -> operationToProduct.displayAll();
                case 4 -> operationToProduct.writeAllItemToFile();
                case 5 -> operationToProduct.index();
                case 6 -> operationToProduct.deleteByProductCode();
                case 7 -> operationToProduct.sortByProductCode();
                case 8 -> operationToProduct.convertBinary();
                case 9 -> operationToProduct.getFileToStack();
                case 10 -> operationToProduct.getFileToQueue();
                case 11 -> {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                }
            }
        }
    }
}
