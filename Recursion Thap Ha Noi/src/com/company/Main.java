package com.company;

public class Main {
    static int k = 1;
    public static void thapHN(int n, char from_rod, char to_rod, char aux_rod) {
        if(n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        thapHN(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        thapHN(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
	    // write your code here

        int n = 4;
        thapHN(4, 'A', 'B', 'C');
    }
}
