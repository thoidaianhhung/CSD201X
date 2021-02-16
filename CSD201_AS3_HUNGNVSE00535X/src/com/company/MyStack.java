package com.company;

import java.util.LinkedList;

public class MyStack {
    LinkedList<Node> t;

    public MyStack() {
        t = new LinkedList<>();
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }

    public void push(Node x) {
        t.add(x);
    }

    public Node pop() {
        return t.pop();
    }
}
