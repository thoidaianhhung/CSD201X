package com.company;

import java.io.*;
import java.util.Scanner;

public class OperationToProduct {
    MyList myList = new MyList();
    public void createProduct() {
        Scanner input = new Scanner(System.in);
        System.out.print("Product Code: ");
        String productCode = input.nextLine();
        System.out.print("Title: ");
        String title = input.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        addLast(productCode, title, price, quantity);
    }
    public void addLast(String productCode, String title, double price, int quantity) {
        myList.append(new Product(productCode, title, price, quantity));
    }

    public void displayAll() {
        myList.printList();
    }

    public void index() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the product code to search = ");
        String key = input.nextLine();
        System.out.println("Result:");
        Product result = myList.search(myList.head, key);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("- 1");
        }
    }

    public void deleteByProductCode() {
        System.out.print("Input the product code to delete = ");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        myList.deleteNode(key);
        displayAll();
        System.out.println("Delete!");
    }

    public void sortByProductCode() {
        System.out.println("Result sort by product code:");
        Node n = myList.head;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        myList.sort(myList.head, n);
        displayAll();
    }

    public void writeAllItemToFile() throws IOException {
        FileOutputStream f = new FileOutputStream("DATA.TXT");
        DataOutputStream file = new DataOutputStream(f);
        Node p = myList.head;
        while (p != null) {
            file.writeUTF(p.getInfo().getProductCode());
            file.writeUTF(p.getInfo().getProductCode());
            file.writeDouble(p.getInfo().getPrice());
            file.writeInt(p.getInfo().getQuantity());
            p = p.getNext();
        }
        file.close();
        System.out.println("Successfully!");
    }

    public void getFileToLinkedList() throws IOException{
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);
        String productCode = file.readUTF();
        String title = file.readUTF();
        Double price = file.readDouble();
        int quantity = file.readInt();
        addLast(productCode, title, price, quantity);
        displayAll();
    }
}
