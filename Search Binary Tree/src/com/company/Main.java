package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        BTree t = new BTree();
        int[] a = {25,10,30,5,20,10,15};
        t.insertMany(a);

        System.out.println("\nPre Order traverse");
        t.preOrder(t.root);

        System.out.println("\nIn Order traverse");
        t.inOrder(t.root);

        System.out.println("\nPost Order traverse");
        t.postOrder(t.root);
    }
}
