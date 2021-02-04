package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Graph g = new Graph();

        int n=6;

        int [][] b = {
                {0,1,1,0,1},
                {1,0,1,0,0},
                {1,1,0,1,0},
                {0,0,1,0,0},
                {1,0,0,0,0},
        };


        g.setData(b);

        g.displayAdj();

        System.out.println();
        g.bfs(1);

        System.out.println("\nIs G is connected? " + g.isConnected());

        System.out.println("\nDegree of the vertex A in G is " + g.degree(0));

        System.out.println();
    }
}
