package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph g = new Graph(7);
        g.addEdg(0, 6);
        g.addEdg(0, 1);
        g.addEdg(1, 5);
        g.addEdg(1, 4);
        g.addEdg(1, 3);
        g.addEdg(1, 2);
        g.addEdg(2, 5);
        g.addEdg(2, 4);
        g.addEdg(2, 3);
        g.addEdg(3, 5);
        g.addEdg(5, 6);
        System.out.println("Following is the Depth First Traversal");
        g.DFS(0);
    }
}
