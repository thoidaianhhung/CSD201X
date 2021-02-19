package com.company;

/**
 * The MyList class
 * purpose contain method of the linked list
 * params Node head
 */
public class MyList {
    Node head;

    MyList () {
        head = null;
    }

    /**
     * Add a node at the end liked list
     * @param x
     */
    public void append(Product x) {
        Node productNode = new Node(x);
        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = new Node(x);
            return;
        }
        // This new node is going to be the last node, so make next of it as null
        productNode.setNext(null);
        // Else traverse till the last node
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        // Change the next of last node
        last.setNext(productNode);
    }

    /**
     * This method prints contents of linked list starting from the given node
     */
    public void printList() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getNext();
        }
    }

    /**
     * Given a key, deletes the first occurrence of key in linked list
     * @param key
     */
    public void deleteNode(String key) {
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (temp.getInfo().getProductCode().compareTo(key) == 0) {
            head = temp.getNext();
            return;
        }

        // change temp.next
        while (temp != null && temp.getInfo().getProductCode().compareTo(key) != 0) {
            prev = temp;
            temp = temp.getNext();
        }

        if (temp == null) {
            return;
        }

        assert prev != null;
        prev.setNext(temp.getNext());
    }

    /**
     * Checks whether the value key is present in linked list
     * @param head
     * @param key
     * @return
     */
    public Product search(Node head, String key) {
        // Initialize current
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

    /**
     * the sorting happens exclusive of the end node
     * @param start
     * @param end
     */
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

    /**
     * convert from base 10 to binary
     * @param number
     * @return
     */
    public int convertBinary(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 2 + 10 * convertBinary(number / 2);
    }
}
