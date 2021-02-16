package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
    // Number of vertices
    int v;

    // Number of edges
    int e;

    // Adjacency matrix
    int[][] adj;
    public Graph(int v, int e) {
        this.v = v;
        this.e = e;
        adj = new int[v][v];
        for (int row = 0; row < v; row++) {
            Arrays.fill(adj[row], 0);
        }
    }

    public void addEdge(int start, int e) {
        adj[start][e] = 1;
        adj[e][start] = 1;
    }

    public void pathDijkstra() {}

    public void depthFirstSearch(int start) {
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        MyStack myStack = new MyStack();
        myStack.push(start);
        visited[start] = true;

        
    }

    public void displayVertices() {}
}
