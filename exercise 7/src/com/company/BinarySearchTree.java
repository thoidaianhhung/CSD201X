package com.company;

public class BinarySearchTree {
    Node root;
    BinarySearchTree() {
        root = null;
    }

    public Node insertRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.info) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.info) {
            root.right = insertRecursive(root.right, key);
        }
        return root;
    }

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    public void insertMany(int[] a) {
        for (int j : a) {
            insert(j);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.info + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public Node searchRecursive(Node root, int key) {
        if (root == null || root.info == key) {
            return root;
        }
        if (key < root.info) {
            return searchRecursive(root.left, key);
        }
        return searchRecursive(root.right, key);
    }

    public void search(Node root, int key) {
        if (root != null) {
            search(root.left, key);
            if (key < root.info) {
                System.out.print(root.info + " ");
            }
            search(root.right, key);
        }
    }
}
