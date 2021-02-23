package com.company;

public class HashTable {
    MyList[] a;
    int M;
    public HashTable() {
        M = 10;
        a = new MyList[10];
        for (int i = 0; i < M; i++) {
            a[i] = new MyList();
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < M; i++) {
            if (!a[i].isEmpty()) {
                empty = false;
                break;
            }
        }
        return empty;
    }

    public void add(Student x) {
        int i = x.ID % M;
        a[i].addList(x);
    }

    public void traverse() {
        for (int i = 0; i < a.length; i++) {
            a[i].traverse();
        }
    }

    public Node search() {
        Node head = null;
        return head;
    }

    public void addArray(int[] ID, String[] name, float[] grad1, float[] grad2, float[] grad3) {
        for (int i = 0; i < 4; i++) {
            add(new Student(ID[i], name[i], grad1[i], grad2[i], grad3[i]));
        }
    }
}
