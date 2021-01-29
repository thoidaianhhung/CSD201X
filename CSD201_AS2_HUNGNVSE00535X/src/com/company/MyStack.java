package com.company;

import java.util.EmptyStackException;

public class MyStack {
    Node head;
    public MyStack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Product x) {
        head = new Node(x, head);
    }

    public Product pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Product x = head.getInfo();
        head = head.getNext();
        return x;
    }
}
