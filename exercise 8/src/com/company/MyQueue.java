package com.company;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> t;
    public MyQueue() {
        t = new LinkedList<>();
    }
    public boolean isEmpty() {
        return t.isEmpty();
    }
    public void enqueue(int x) {
        t.add(x);
    }
    public int dequeue() {
        return t.removeFirst();
    }

    public int sizeQueue() {
        return t.size();
    }
}
