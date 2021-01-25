package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
    Node head;
    MyStack() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void push(int x) {
        head = new Node(x, head);
    }

    int top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return head.info;
    }

    public int pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int x = head.info;
        head = head.next;
        return x;
    }

    public void covertToBinary(int x) {
        Stack<Integer> stack = new Stack<Integer>();
        int du;
        int number = x;
        while (number > 0) {
            du = number % 2;
            stack.push(du);
            number /= 2;
        }

        System.out.print("Output: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());

        }
    }
}
