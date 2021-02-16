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
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.empty()) {
            s = stack.peek();
            stack.pop();
            if (!visited.get(s)) {
                System.out.print(s + " ");
                visited.set(s, true);
            }
            Iterator<Integer> iterator = adj[s].iterator();
            while (iterator.hasNext()) {
                int v = iterator.next();
                if (!visited.get(v)) {
                    stack.push(v);
                }
            }
        }
    }
}
