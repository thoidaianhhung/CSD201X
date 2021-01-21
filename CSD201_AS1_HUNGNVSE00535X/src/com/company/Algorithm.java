package com.company;

import java.io.*;
import java.util.Scanner;

public class Algorithm {
    Algorithm() {}

    int number = 0;
    float[] a;

    // Nhập dữ liệu từ bàn phím
    public void writeFile() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        number = Integer.parseInt(input.nextLine());
        float[] arr = new float[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Input elements arr[" + i + "] : ");
            arr[i] = input.nextFloat();
        }
        FileOutputStream f = new FileOutputStream("INPUT.TXT");
        DataOutputStream file = new DataOutputStream(f);
        for (int i = 0; i < number; i++) {
            file.writeFloat(arr[i]);
        }
        file.close();
    }

    // Đọc dữ liệu từ tệp lưu vào mảng a
    public void readFile() throws IOException {
        System.out.println("Read from file");
        System.out.print("Array a:");
        FileInputStream f = new FileInputStream("INPUT.TXT");
        DataInputStream file = new DataInputStream(f);
        a = new float[number];
        for (int i = 0; i < number; i++) {
            a[i] = file.readFloat();
        }
        displayData(a, number);
    }

    //  Hiển thị dữ liệu ra màn hình
    public void displayData(float[] a, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    // Sắp xếp theo thuật toán bubble sort
    public void bubbleSort() throws IOException {
        int n = a.length;
        float[] b = new float[n];
        System.arraycopy(a, 0, b,0, n);
        float x;
        System.out.println("Bubble sort");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    x = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = x;
                }
            }
            displayData(b, n);
        }
        long end = System.currentTimeMillis();
        System.out.println("Running time of bubble sort: " + (end - start));
        FileOutputStream f = new FileOutputStream("OUTPUT1.TXT");
        DataOutputStream file = new DataOutputStream(f);
        for (int i = 0; i < number; i++) {
            file.writeFloat(b[i]);
        }
        file.close();
    }

    // Sắp xếp theo thuật toán Selection Sort
    public void selectionSort() throws IOException {
        int n = a.length;
        float[] b = new float[n];
        System.arraycopy(a, 0, b, 0, n);
        float x;
        System.out.println("Selection sort");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (b[min_index] > b[j]) {
                    min_index = j;
                }
            }
            x = b[i];
            b[i] = b[min_index];
            b[min_index] = x;
            displayData(b, n);
        }
        long end = System.currentTimeMillis();
        System.out.println("Running time of selection sort: " + (end - start));
        FileOutputStream f = new FileOutputStream("OUTPUT2.TXT");
        DataOutputStream file = new DataOutputStream(f);
        for (int i = 0; i < number; i++) {
            file.writeFloat(b[i]);
        }
        file.close();
    }

    // Sắp xếp theo thuật toán Insertion Sort
    public void insertionSort() throws IOException {
        int n = a.length;
        float[] b = new float[n];
        System.arraycopy(a, 0, b, 0, n);
        System.out.println("Insertion sort");
        float key;
        int j;
        long start = System.currentTimeMillis();
        for (int i = 1; i < n; i++) {
            key = b[i];
            j = i - 1;
            while (j >= 0 && key < b[j]) {
                b[j + 1] = b[j];
                j = j - 1;
            }
            b[j + 1] = key;
            displayData(b, n);
        }
        long end = System.currentTimeMillis();
        System.out.println("Running time of insertion sort: " + (end - start));
        FileOutputStream f = new FileOutputStream("OUTPUT3.TXT");
        DataOutputStream file = new DataOutputStream(f);
        for (int i = 0; i < number; i++) {
            file.writeFloat(b[i]);
        }
        file.close();
    }

    // Tìm kiếm theo thuật toán tuần tự
    public void search() throws IOException {
        int n = a.length;
        float[] b = new float[n];
        System.arraycopy(a, 0, b, 0, n);
        System.out.println("Linear Search");
        Scanner input = new Scanner(System.in);
        System.out.print("Input value: ");
        float key = input.nextFloat();
        System.out.print("Index is:");
        FileOutputStream f = new FileOutputStream("OUTPUT4.TXT");
        DataOutputStream file = new DataOutputStream(f);
        for (int i = 0; i < n; i++) {
            if (b[i] > key) {
                System.out.print(" " + i);
                file.writeInt(i);
            }
        }
        file.close();
        System.out.println();
    }

    // Tìm kiếm theo thuật toán nhị phân
    public void binarySearch() {
        int n = a.length;
        float[] b = new float[n];
        System.arraycopy(a, 0, b, 0, n);
        System.out.println("Insertion sort");
        float key;
        int j;
        for (int i = 1; i < n; i++) {
            key = b[i];
            j = i - 1;
            while (j >= 0 && key < b[j]) {
                b[j + 1] = b[j];
                j = j - 1;
            }
            b[j + 1] = key;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Input value: ");
        float x = input.nextFloat();
        int lo = 0;
        int hi = b.length - 1;
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (x > b[mid]) {
                lo = mid + 1;
            } else if (x < b[mid]) {
                hi = mid - 1;
            } else {
                System.out.println("Indext of fist element: " + mid);
                break;
            }
        }
    }
}
