package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * The MyPerson class purpose contains methods for the functional requirements of binary search tree.
 * return add staff profiles, traverses trees, search, delete, balance binary search tree trees.
 */
public class MyPerson {
    /**
     * Construct MyPerson class
     */
    public MyPerson() {}

    MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();

    /**
     * The insert method purpose add new staff profiles to the binary search tree trees.
     */
    public void insert() {
        Scanner input = new Scanner(System.in);
        System.out.print("Staff Code: ");
        String staffCode = input.nextLine();
        System.out.print("Staff Name: ");
        String staffName = input.nextLine();
        System.out.print("Date Of Birth (dd/MM/yyyy) : ");
        String dateOfBirth;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            try {
                dateOfBirth = input.nextLine();
                format.parse(dateOfBirth);
                break;
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.print("Date Of Birth (dd/MM/yyyy) : ");
            }
        }
        System.out.print("Place Of Birth: ");
        String placeOfBirth = input.nextLine();
        binarySearchTree.insert(new Person(staffCode, staffName, dateOfBirth, placeOfBirth));
    }

    /**
     * The inOrder method purpose traverses the binary search tree trees in InOrder order.
     */
    public void inOrder() {
        binarySearchTree.inOrder(binarySearchTree.root);
    }

    /**
     * The traversesBFSTree method browse trees by width use queue
     */
    public void traversesBFSTree() throws Exception {
        binarySearchTree.traversesBFSTree(binarySearchTree.root);
    }

    /**
     * @purpose find employee information by employee code in the BST tree
     */
    public void searchPerson() {
        System.out.print("Search for ID: ");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        binarySearchTree.searchBFSTree(binarySearchTree.root, key);
    }

    /**
     * @purpose Delete an employee profile based on the employee code in the BST tree
     */
    public void deletePerson() {
        System.out.print("Delete for ID: ");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        binarySearchTree.deletePerson(key);
        inOrder();
    }

    /**
     *
     */
    public void balanced() {}
}
