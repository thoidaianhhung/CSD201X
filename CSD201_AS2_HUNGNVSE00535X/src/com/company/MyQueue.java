package com.company;

/**
 * initializing or defining the queue
 * then completely erasing it from the memory
 */

public class MyQueue {
    Node head, tail;
    public MyQueue() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Product x) {
        if (isEmpty()) {
            head = tail = new Node(x);
        } else {
            tail.setNext(new Node(x));
            tail = tail.getNext();
        }

    }

    public Product dequeue() throws Exception{
        if (isEmpty()) {
            throw new Exception();
        }
        Product x = head.getInfo();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return x;
    }
}
