package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("Enter N element: ");
        int N = Integer.parseInt(input.nextLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a["+ i + "] : ");
            a[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("Enter element search: ");
        int key = Integer.parseInt(input.nextLine());
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertMany(a);
        System.out.println("Output:");
        System.out.println("\nPre-order traverse:");
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println("\nIn-order traverse:");
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println("\nSearch: ");
        binarySearchTree.search(binarySearchTree.root, key);
    }
}
