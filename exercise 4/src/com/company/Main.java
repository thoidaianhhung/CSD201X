package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String[] a = {"HOA","HA","LAN","NOI","MUA","NAY"};
        int[] b = {25,17,26,19,23,21};
        MyList t = new MyList();
        t.addMany(a, b);
        System.out.println("Traverse:");
        t.traverse();
        System.out.println();
        System.out.println("Sort By Name:");
        t.sortByName();
        t.traverse();
    }
}
