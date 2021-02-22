package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int choice, x;
        Node p;
        int n = 20;
        int[] b = new int[4];
        String[] c = new String[4];
        float[] d = new float[4];
        float[] e = new float[4];
        float[] f = new float[4];
        input(b, c, d, e, f);
    }

    public static void input(int[] b, String[] c, float[] d, float[] e, float[] f) {
        Scanner input = new Scanner(System.in);
        System.out.println("Import Id: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Import element [" + i + "] : ");
            b[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println();
        System.out.println("Import name: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Import element [" + i + "] : ");
            c[i] = input.nextLine();
        }
        d = new float[]{7, 7, 7, 4};
        e = new float[] {8, 4, 8, 8};
        f = new float[] {9, 6, 9, 9};
    }
}
