package com.company;

import java.util.LinkedList;

/**
 * The MyQueue class creating construct Queue use LinkedList
 */
public class MyQueue {
    LinkedList<Node> t;
    public MyQueue() {
        t = new LinkedList<>();
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }

    /**
     * @purpose add an element at the end of the LinkedList
     * @param x
     */
    public void enqueue(Node x) {
        t.add(x);
    }

    /**
     * @purpose remove an element at the first of the LinkedList
     * @return the first element after removing it
     */
    public Node dequeue() {
        return t.removeFirst();
    }
}
