package com.company;

public class BTree {
    Node root;

    public BTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    /**
     *  Search method
     */
    public Node search(Node p, int x) {
        if (p == null) {
            return null;
        }
        if (p.info == x) {
            return p;
        }
        if (x < p.info) {
            return search(p.left, x);
        }
        return search(p.right, x);
    }

    /**
     *  Insert method add 1 element into the tree
     */
    public void insert(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            root = p;
            return;
        }
        Node f, q;
        f = null;
        q = root;
        while (q != null) {
            if (q.info == x) {
                System.out.println("The key " + x + " already exists, no insertion.");
                break;
            }
            f = q;
            if (x < q.info) {
                q = q.left;
            } else {
                q = q.right;
            }
        }
        assert f != null;
        if (x < f.info) {
            f.left = q;
        } else {
            f.right = q;
        }
    }

    public void insertMany(int[] a) {
        for (int j : a) {
            insert(j);
        }
    }

    public void visit(Node p) {
        System.out.print(p.info + " ");
    }

    public void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    public void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    public void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }
}
