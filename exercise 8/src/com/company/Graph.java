package com.company;

import java.util.Iterator;

public class Graph {
    int[][] a;
    int n;
    MyQueue myQueue = new MyQueue();

    public Graph() {
        a = null;
        n = 0;
    }

    public void setData(int[][] b) {
        n = b.length;
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

    public void displayAdj() {
        System.out.println("\nThe adjacency matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", a[i][j]);
            }
        }
    }

    public void visit(int i) {
        System.out.print(i + " ");
    }

    public void bfs (int s) {
        boolean[] visited = new boolean[n];

        // Đánh dấu nút hiện tại là đã truy cập và xếp nó vào hàng đợi
        visited[s] = true;
        myQueue.enqueue(s);

        while (myQueue.sizeQueue() != 0) {
            s = myQueue.dequeue();
            visit(s);
        }
    }

    public boolean isConnected() {
        return false;
    }

    public int degree(int k) {
        return 0;
    }
}
