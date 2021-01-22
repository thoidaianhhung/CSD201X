package com.company;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }
    boolean isEmpty() {
        return head == null;
    }

    public void addTail(Person x) {}

    public void addMany(String[] a, int[] b) {}

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }

    public void sortByName() {}
}
