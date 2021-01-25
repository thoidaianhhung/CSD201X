package com.company;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }

    public void addTail(Person x) {
        Node q = new Node(x);
        if (head == null) {
            head = new Node(x);
            return;
        }
        q.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = q;
    }

    public void addMany(String[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            addTail(new Person(a[i], b[i]));
        }
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }
    }

    public void sortByName() {
        Node pi, pj;
        Person t;
        pi = head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                int x = pi.info.getName().compareTo(pj.info.getName());
                if (x > 0) {
                    t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }
}
