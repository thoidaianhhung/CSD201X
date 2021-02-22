package com.company;

public class Node {
    public Student info;
    public Node next;

    public Node(Student x, Node p) {
        info = x;
        next = p;
    }

    public Node(Student x) {
        this (x, null);
    }
}
