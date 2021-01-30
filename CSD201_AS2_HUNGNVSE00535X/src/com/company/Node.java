package com.company;

/**
 * The Node class
 * purpose manages the information and behavior of each node in the list
 * params Product info, Node next
 * return Product info, Node next.
 */
public class Node {
    private Product info;
    private Node next;

    public Node(Product x, Node p) {
        setInfo(x);
        setNext(p);
    }

    public Node(Product x) {
        this (x,null);
    }

    public Product getInfo() {
        return this.info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setInfo(Product info) {
        this.info = info;
    }
}
