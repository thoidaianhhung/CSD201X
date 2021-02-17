package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Graph {
    public int V;
    public int noParent = -1;
    LinkedList<Integer>[] adj;
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdg(int v, int w) {
        adj[v].add(w);
    }

    public void DFS(int s) {
        Vector<Boolean> visited = new Vector<>(V);
        for (int i = 0; i < V; i++) {
            visited.add(false);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.empty()) {
            s = stack.peek();
            stack.pop();
            if (!visited.get(s)) {
                switch (s) {
                    case 0 -> System.out.print('A' + " ");
                    case 1 -> System.out.print('B' + " ");
                    case 2 -> System.out.print('C' + " ");
                    case 3 -> System.out.print('D' + " ");
                    case 4 -> System.out.print('E' + " ");
                    case 5 -> System.out.print('F' + " ");
                    case 6 -> System.out.print('G' + " ");
                }

                visited.set(s, true);
            }
            for (int v : adj[s]) {
                if (!visited.get(v)) {
                    stack.push(v);
                }
            }
        }
    }

    public void dijkstra(int[][] adjacencyMatrix, int startVertex) {
        int nVertices = adjacencyMatrix[0].length;

        int[] shortestDistances = new int[nVertices];

        boolean[] added = new boolean[nVertices];

        for (int vertexIndex = 0 ; vertexIndex < nVertices; vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        shortestDistances[startVertex] = 0;

        int[] parents = new int[nVertices];

        parents[startVertex] = noParent;

        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }
            added[nearestVertex] = true;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];
                if (edgeDistance > 0 && (shortestDistance + edgeDistance) < shortestDistances[vertexIndex]) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }

        }
    }
    public void pathDijkstra() {

    }

    public void displayVertices() {
        addEdg(0, 1);
        addEdg(0, 6);
        addEdg(1, 2);
        addEdg(1, 3);
        addEdg(1, 4);
        addEdg(1, 5);
        addEdg(2, 1);
        addEdg(2 ,3);
        addEdg(2, 4);
        addEdg(2, 5);
        addEdg(3, 1);
        addEdg(3, 6);
        addEdg(4, 3);
        addEdg(5, 1);
        addEdg(5, 6);
        System.out.println("Following is the Depth First Traversal");
        DFS(0);
        System.out.println();
    }
}
