package com.company;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("Choose one of this options:");
        System.out.println("Person Tree:");
        System.out.println("1. Insert a new Person.");
        System.out.println("2. InOrder traverse.");
        System.out.println("3. Traverses the BST tree by width.");
        System.out.println("4. Search by Person ID.");
        System.out.println("5. Delete by Person ID.");
        System.out.println("6. Balancing Binary Search Tree.");
        System.out.println("7. DFS Graph.");
        System.out.println("8. Dijkstra.");
        System.out.println("0. Exit.");
    }

    public static void main(String[] args) throws Exception {
	    // write your code here
        System.out.println();
        System.out.println("Welcome to the manager records and find the shortest route.");
        System.out.println();
        MyPerson myPerson = new MyPerson();
        Graph graph = new Graph();
        while (true) {
            showMenu();
            Scanner input = new Scanner(System.in);
            System.out.print("Your choice: ");
            int choice = 0;
            // Check choice is integer.
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    choice = Integer.parseInt(input.nextLine());
                    if (choice >= 0 && choice <= 8) {
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
            switch(choice) {
                case 1 -> myPerson.insert();
                case 2 -> myPerson.inOrder();
                case 3 -> myPerson.traversesBFSTree();
                case 4 -> myPerson.searchPerson();
                case 5 -> myPerson.deletePerson();
                case 6 -> myPerson.balancedBST();
                case 7 -> graph.depthFirstSearch();
                case 8 -> graph.pathDijkstra();
                default -> {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                }
            }
        }
    }
}
