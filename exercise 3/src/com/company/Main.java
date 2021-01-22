package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MyList t  = new MyList();
        int[] a = {7, 2, 9, 6, 8, 3};
        t.addMany(a);
        System.out.print("Traverse: ");
        t.traverse();
        System.out.println();
        System.out.print("Search(8): ");
        t.search(8);
    }
}
