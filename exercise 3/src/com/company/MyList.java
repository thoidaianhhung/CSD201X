package com.company;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }
    boolean isEmpty() {
        return head == null;
    }

    public void addHead(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
        } else {
            q.next = head;
            head = q;
        }
    }

    public void addMany(int[] a) {
        for (int j : a) {
            addHead(j);
        }
    }

    public void visit(Node p) {
        System.out.print(p.info + " ");
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.next;
        }
    }

    public void search(int x) {
        Node current = head;
        int t = 0;
        while (current != null) {
            t++;
            if (current.info == x) {
                System.out.print(t);
                break;
            } else {
                current = current.next;
            }
        }
    }
}
