package com.company;

import java.util.LinkedList;
import java.util.Vector;

public class Graph {
    public int V;
    public int noParent = -1;

    public static int INF = 9999;
    LinkedList<Integer>[] adj;
    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
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
        MyStack myStack = new MyStack();
        myStack.push(s);
        while (!myStack.isEmpty()) {
            s = myStack.pop();
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
                    myStack.push(v);
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
        printSolution(shortestDistances, parents);
    }

    public void printSolution(int[] distances, int[] parents) {
        System.out.print("The length of shortest path from A to  E is: " + distances[4]);
        System.out.println();
        System.out.println("Path:");
        printPath(4, parents);
        System.out.println();
    }

    public void printPath(int currentVertex, int[] parents) {
        if (currentVertex != noParent) {
            printPath(parents[currentVertex], parents);

            switch (currentVertex) {
                case 0 -> System.out.print('A' + " ");
                case 1 -> System.out.print('B' + " ");
                case 2 -> System.out.print('C' + " ");
                case 3 -> System.out.print('D' + " ");
                case 4 -> System.out.print('E' + " ");
                case 5 -> System.out.print('F' + " ");
                case 6 -> System.out.print('G' + " ");
            }
        }
    }
    public void pathDijkstra() {
        int[][] adjacencyMatix = {
                {0, 10, INF, INF, INF, INF, 8},
                {INF, 0, 2, 10, 25, 80, INF},
                {30, INF, 0, 8, 3, 20, INF},
                {20, INF, INF, 0, INF, 5, 10},
                {INF, INF, INF, 4, 0, INF, INF},
                {8, INF, INF, INF, INF, 0, 5},
                {8, INF, INF, INF, INF, INF, 0}
        };
        System.out.println("The weighted matrix of the graph:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(adjacencyMatix[i][j] + " ");
            }
            System.out.println();
        }
        dijkstra(adjacencyMatix, 0);
    }

    public void displayVertices() {
        addEdg(0, 6);
        addEdg(0, 1);
        addEdg(1, 5);
        addEdg(1, 4);
        addEdg(1, 3);
        addEdg(1, 2);
        addEdg(2, 5);
        addEdg(2, 4);
        addEdg(2, 3);
        addEdg(3, 5);
        addEdg(5, 6);
        System.out.println("Following is the Depth First Traversal");
        DFS(0);
        System.out.println();
    }
}
