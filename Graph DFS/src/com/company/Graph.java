package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Graph {
    public int V;
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
        /*Stack<Integer> stack = new Stack<>();
        stack.push(s);*/
        MyStack myStack = new MyStack();
        myStack.push(s);
        while (!myStack.isEmpty()) {
            s = myStack.pop();

            if (!visited.get(s)) {
                /*switch (s) {
                    case 0 -> System.out.print('A' + " ");
                    case 1 -> System.out.print('B' + " ");
                    case 2 -> System.out.print('C' + " ");
                    case 3 -> System.out.print('D' + " ");
                    case 4 -> System.out.println('E' + " ");
                }*/
<<<<<<< HEAD
=======
                System.out.print(s + " ");
>>>>>>> origin/master

                System.out.print(s + " ");
                visited.set(s, true);

            }
            for (int v : adj[s]) {
                if (!visited.get(v)) {
                    myStack.push(v);
                }
            }
        }
    }
}
