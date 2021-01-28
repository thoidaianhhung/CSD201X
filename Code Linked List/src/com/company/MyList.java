package com.company;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }
    boolean isEmpty() {
        return (head == null);
    }

    void addLast(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }
    void addMany(int[] a) {
        for (int j : a) {
            addLast(j);
        }
    }
    void visit(Node p) {
        System.out.print(p.info + " ");
    }
    void traverse() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.next;
        }
    }
    /*void sort() {
        Node pi, pj;
        int t;
        pi = head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pj.info < pi.info) {
                    t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }

    }*/

    Node partitionLast(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }

        Node pivot_prev = start;
        Node cur = start;
        int pivot = end.info;

        while (start != end) {

            if (start.info < pivot) {
                pivot_prev = cur;
                int temp = cur.info;
                cur.info = start.info;
                start.info = temp;
                cur = cur.next;
            }
            start = start.next;
        }
        int temp = cur.info;
        cur.info = end.info;
        end.info = temp;

        return pivot_prev;
    }

    public void sort(Node start, Node end) {
        if (start == end) {
            return;
        }

        Node pivot_prev = partitionLast(start, end);
        sort(start, pivot_prev);

        if (pivot_prev != null && pivot_prev == start) {
            sort(pivot_prev.next, end);
        }
        else if (pivot_prev != null && pivot_prev.next != null) {
            sort(pivot_prev.next.next, end);
        }
    }
}
