package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int x = 5;
        System.out.print("Input: " + x);
        System.out.println();
        MyStack t = new MyStack();
        t.covertToBinary(x);
    }
}
