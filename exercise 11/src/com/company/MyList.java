package com.company;

public class MyList {
    public Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addList(Student x) {
        Node studentNode = new Node(x);
        if (head == null) {
            head = studentNode;
            return;
        }
        studentNode.next = null;
        Node tail = head;
        if (tail.next != null) {
            tail = tail.next;
        }
        tail.next = studentNode;
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.next;
        }
    }

    public Node search() {
        return null;
    }

    public void delete() {}
}
