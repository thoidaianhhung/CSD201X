package com.company;

public class MyList {
    Node head;

    MyList () {
        head = null;
    }

    public void append(Product x) {
        Node productNode = new Node(x);
        if (head == null) {
            head = new Node(x);
            return;
        }
        productNode.setNext(null);
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(productNode);
    }

    public void printList() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getNext();
        }
    }

    public void deleteNode(String key) {
        Node temp = head;

        int x = temp.getInfo().getProductCode().compareTo(key);
        if (x == 0) {
            head = temp.getNext();
            return;
        }

        while (temp != null) {
            temp = temp.getNext();
        }
    }

    public Product search(Node head, String key) {
        Node current = head;
        while (current != null) {
            if (current.getInfo().getProductCode().equals(key)) {
                return current.getInfo();
            }
            current = current.getNext();
        }
        return null;
    }

    Node partitionLast(Node start, Node end) {
        if (start == end || start == null || end == null) {
            return start;
        }

        Node pivot_prev = start;
        Node cur = start;
        Product pivot = end.getInfo();

        while (start != end) {
            int y = start.getInfo().getProductCode().compareTo(pivot.getProductCode());
            if (y > 0) {
                pivot_prev = cur;
                Product temp = cur.getInfo();
                cur.setInfo(start.getInfo());
                start.setInfo(temp);
                cur = cur.getNext();
            }
            start = start.getNext();
        }

        Product temp = cur.getInfo();
        cur.setInfo(pivot);
        end.setInfo(temp);
        return pivot_prev;
    }

    public void sort(Node start, Node end) {
        if (start == end) {
            return;
        }

        Node pivot_prev = partitionLast(start, end);
        sort(start, pivot_prev);

        if (pivot_prev != null && pivot_prev == start) {
            sort(pivot_prev.getNext(), end);
        }
        else if (pivot_prev != null && pivot_prev.getNext() != null) {
            sort(pivot_prev.getNext().getNext(), end);
        }
    }

    public int convertBinary(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 2 + 10 * convertBinary(number / 2);
    }
}
