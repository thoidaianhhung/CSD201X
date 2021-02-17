package com.company;

import java.util.LinkedList;

public class MyStack {
    LinkedList<Integer> t;

    public MyStack() {
        t = new LinkedList<>();
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }

    public void push(int x) {
        t.add(x);
    }

    public int pop() {
        return t.removeLast();
    }
}
