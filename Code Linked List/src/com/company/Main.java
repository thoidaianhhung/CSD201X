package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MyList t = new MyList();
        int[] a = {7,2,9,8,6,3};
        t.addMany(a);
        System.out.println("\n Before sorting:");
        t.traverse();
        System.out.println("\n After sorting:");
        t.sort();
        t.traverse();
        System.out.println();
    }
}
