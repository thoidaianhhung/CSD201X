package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int choice, x;
        Node p;
        int[] b = new int[4];
        String[] c = new String[4];
        float[] d = new float[4];
        float[] e = new float[4];
        float[] f = new float[4];
        input(b, c, d, e, f);
        HashTable t = new HashTable();

        System.out.println("1. Nhập.");
        System.out.println("2. Hiển thị.");
        System.out.println("3. Tìm kiếm theo ID.");
        System.out.println("0. Thoát.");

        while (true) {
            System.out.println("Nhập chức năng 1/2/3:");
            choice = Integer.parseInt(input.nextLine());
            if (choice == 0) {
                System.out.println("Thoát.");
                break;
            }

            switch (choice) {
                case 1 -> t.addArray(b, c, d, e, f);
                case 2 -> t.traverse();
                case 3 -> {
                    System.out.println("Nhập ID cần tìm kiếm:");
                    x = Integer.parseInt(input.nextLine());
                    p = t.search();
                    if (p != null) {
                        System.out.println(x + " ");
                    } else {
                        System.out.println(x + " không tìm thấy.");
                    }
                }
            }
        }
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

        System.out.println();
        System.out.println("Nhập điểm môn Toán: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Import element [" + i + "] : ");
            d[i] = input.nextFloat();
        }

        System.out.println();
        System.out.println("Nhập điểm môn Toán: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Import element [" + i + "] : ");
            e[i] = input.nextFloat();
        }

        System.out.println();
        System.out.println("Nhập điểm môn Toán: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Import element [" + i + "] : ");
            f[i] = input.nextFloat();
        }
    }
}
