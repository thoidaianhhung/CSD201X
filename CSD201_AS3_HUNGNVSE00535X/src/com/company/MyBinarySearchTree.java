package com.company;

/**
 * The MyBinarySearchTree purpose contains information and behavior of a search binary tree.
 */
public class MyBinarySearchTree {
    // root of BST
    Node root;

    // construct MyBinarySearchTree class
    public MyBinarySearchTree() {
        root = null;
    }

    /**
     * Purpose insert a new key in BST
     * @param root
     * @param key
     * @return root
     */
    public Node insertRecursive(Node root, Person key) {
        // If the tree is empty, return a new Node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // recursive down the tree
        int mid = key.getStaffCode().compareTo(root.info.getStaffCode());
        if (mid < 0) {
            root.left = insertRecursive(root.left, key);
        } else if (mid > 0) {
            root.right = insertRecursive(root.right, key);
        }
        return root;
    }

    /**
     * The insert method calls insertRecursive()
     */
    public void insert(Person key) {
        root = insertRecursive(root, key);
    }

    /**
     * purpose use recursion to traverse the tree in Inorder traversing order
     * @param root
     */
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.info);
            inOrder(root.right);
        }
    }
}
