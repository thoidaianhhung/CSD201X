package com.company;

public class Node {
    int info;
    Node next;
    Node() {}
    Node(int x, Node p) {
        info = x;
        next = p;
    }
    Node(int x) {
        this(x, null);
    }
}
