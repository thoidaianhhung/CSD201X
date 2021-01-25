package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String input = "Java Source and Support";
        String output;
        StringReverserThroughStack stringReverserThroughStack = new StringReverserThroughStack(input);
        output = stringReverserThroughStack.doRev();
        System.out.println("Reversed: " + output);

    }
}
