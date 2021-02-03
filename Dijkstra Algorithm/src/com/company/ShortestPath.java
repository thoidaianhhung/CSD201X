package com.company;

public class ShortestPath {
    public int V;
    public ShortestPath(int v) {
        V = v;
    }

    public int minDistance(int[] distance, boolean[] sptSet) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && distance[v] <= min) {
                min = distance[v];
                min_index = v;
            }
        }
        return min_index;
    }

    public void printSolution(int[] distance) {
        System.out.println("Vertex \t\t distance from source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + distance[i]);
        }
    }

    public void dijkstra(int[][] graph, int src) {
        int[] distance = new int[V];
        boolean[] sptSet = new boolean[V];

        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        distance[src] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(distance, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE
                && distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        printSolution(distance);
    }
}
