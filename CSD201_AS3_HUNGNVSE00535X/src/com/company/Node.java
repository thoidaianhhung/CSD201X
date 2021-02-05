package com.company;

public class Node {
    public Person info;
    public Node left, right;

    public Node(Person x) {
        info = x;
        left = right = null;
    }
}
