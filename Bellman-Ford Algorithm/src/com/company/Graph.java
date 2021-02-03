package com.company;

public class Graph {
    public Edge[] edges;
    int V, E;
    public Graph(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[e];
        for (int i = 0; i < e; i++) {
            edges[i] = new Edge();
        }
    }

    public void BellmanFord(Graph graph, int src) {
        int V = graph.V, E = graph.E;
        int[] dist = new int[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[src] = 0;

        for (int i = 1; i < V; ++i) {
            for (int j = 0; j < E; ++j) {
                int u = graph.edges[j].src;
                int v = graph.edges[j].dest;
                int weight = graph.edges[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        for (int i = 0; i < E; ++i) {
            int u = graph.edges[i].src;
            int v = graph.edges[i].dest;
            int weight = graph.edges[i].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle.");
                return;
            }
        }
        printArr(dist, V);
    }

    public void printArr(int[] dist, int v) {
        System.out.println("Vertex distance from Source.");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
}
