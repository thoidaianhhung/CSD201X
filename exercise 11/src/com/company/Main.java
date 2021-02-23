package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Student> map = new Map<>();
        int id;

        while (true) {
            showMenu();
            System.out.print("Choice: ");
            int choice = 0;
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } else {
                    System.out.print("Choice: ");
                    input.nextLine();
                }
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Nhap ID: ");
                    id = Integer.parseInt(input.nextLine());
                    System.out.print("Nhap name: ");
                    String name = input.nextLine();
                    System.out.print("Nhap diem Toan: ");
                    float math = Float.parseFloat(input.nextLine());
                    System.out.print("Nhap diem Hoa: ");
                    float chemistry = Float.parseFloat(input.nextLine());
                    System.out.print("Nhap diem Ly: ");
                    float physics = Float.parseFloat(input.nextLine());
                    map.add(id, new Student(id, name, math, chemistry, physics));
                    System.out.println();
                }
                case 2 -> {
                    for (int i = 0; i <= map.size(); i++) {
                        if (map.get(i) != null) {
                            System.out.println(map.get(i).toString());
                        } else {
                            System.out.println(i + " null");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Import key:");
                    int key = Integer.parseInt(input.nextLine());
                    if (map.get(key) != null) {
                        System.out.println(map.get(key).toString());
                    } else {
                        System.out.println(key + " not found.");
                    }
                }
                case 0 -> System.exit(0);
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. Nhập.");
        System.out.println("2. Hiển thị.");
        System.out.println("3. Tìm kiếm theo ID.");
        System.out.println("0. Thoát");
    }
}
