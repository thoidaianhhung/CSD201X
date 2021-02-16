package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph g = new Graph(5);

        g.addEdg(1, 0);
        g.addEdg(0, 2);
        g.addEdg(2, 1);
        g.addEdg(0, 3);
        g.addEdg(1, 4);

        System.out.println("Following is the Depth First Traversal");
        g.DFS(0);
    }
}
