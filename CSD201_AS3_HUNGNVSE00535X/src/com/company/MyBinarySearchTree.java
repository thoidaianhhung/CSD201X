package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

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

    /**
     * purpose function to print breadth-first of binary tree
     * @param root
     */
    public void traversesBFSTree(Node root) throws Exception {
        if (root == null) {
            return;
        }
        MyQueue myQueue = new MyQueue();
        // add Node root into queue at tail
        myQueue.enqueue(root);

        while (!myQueue.isEmpty()) {
            Node temp = myQueue.dequeue();
            System.out.println(temp.info);
            // Add node left to queue
            if (temp.left != null) {
                myQueue.enqueue(temp.left);
            }
            // Add node right to queue
            if (temp.right != null) {
                myQueue.enqueue(temp.right);
            }
        }
    }

    /**
     * @purpose use Queue storage structure and Queue manipulation to search
     * @param root
     * @param key
     */
    public void searchBFSTree(Node root, String key) {
        if (root == null) {
            return;
        }

        MyQueue myQueue = new MyQueue();
        // Add Node root into queue at tail
        myQueue.enqueue(root);

        while (!myQueue.isEmpty()) {
            Node temp = myQueue.dequeue();
            int mid = key.compareTo(temp.info.getStaffCode());
            if (mid == 0) {
                System.out.println(temp.info);
            }
            // Add node left to queue
            if (temp.left != null) {
                myQueue.enqueue(temp.left);
            }
            // Add node right to queue
            if (temp.right != null) {
                myQueue.enqueue(temp.right);
            }
        }
    }

    /**
     * @purpose This method call deleteRecursive()
     * @param key
     */
    public void deletePerson(String key) {
        root = deleteRecursive(root, key);
    }

    /**
     * @purpose A recursive function to delete an existing key in BST
     * @param root
     * @param key
     * @return root
     */
    public Node deleteRecursive(Node root, String key) {
        // Base case
        if (root == null) {
            return root;
        }
        // Recursive down the tree
        int mid = key.compareTo(root.info.getStaffCode());
        if (mid < 0) {
            root.left = deleteRecursive(root.left, key);
        } else if (mid > 0) {
            root.right = deleteRecursive(root.right, key);
        } else {
            // node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.info = minValue(root.right);
            // Delete the inorder successor
            root.right = insertRecursive(root.right, root.info);
        }
        return root;
    }

    /**
     * @purpose find min value left for root
     * @param root
     * @return value
     */
    public Person minValue(Node root) {
        Person minValue = root.info;
        while (root.left != null) {
            minValue = root.left.info;
            root = root.left;
        }
        return minValue;
    }
}
