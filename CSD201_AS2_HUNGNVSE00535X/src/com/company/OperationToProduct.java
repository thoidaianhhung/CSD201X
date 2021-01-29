package com.company;

import java.io.*;
import java.util.Scanner;

public class OperationToProduct {
    MyList myList = new MyList();
    MyStack myStack = new MyStack();
    MyQueue myQueue = new MyQueue();

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
        int number = 0;
        Node p = myList.head;
        while (p != null) {
            number++;
            file.writeUTF(p.getInfo().getProductCode());
            file.writeUTF(p.getInfo().getProductCode());
            file.writeDouble(p.getInfo().getPrice());
            file.writeInt(p.getInfo().getQuantity());
            p = p.getNext();
        }
        FileOutputStream index = new FileOutputStream("INDEX.TXT");
        DataOutputStream indexFile = new DataOutputStream(index);
        indexFile.writeInt(number);
        file.close();
        System.out.println("Successfully!");
    }

    public void getFileToLinkedList() throws IOException{
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);

        FileInputStream index = new FileInputStream("INDEX.TXT");
        DataInputStream indexFile = new DataInputStream(index);
        int number = indexFile.readInt();
        for (int i = 0; i < number; i++) {
            String productCode = file.readUTF();
            String title = file.readUTF();
            double price = file.readDouble();
            int quantity = file.readInt();
            addLast(productCode, title, price, quantity);
        }
        indexFile.close();
        file.close();
        displayAll();
    }

    public void convertBinary() {
        Node p = myList.head;
        int number = p.getInfo().getQuantity();
        System.out.println("The number of products render before the binary: " + number);
        System.out.println("The number of products render after the binary: " + myList.convertBinary(number));
    }

    public void getFileToStack() throws IOException {
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);

        FileInputStream index = new FileInputStream("INDEX.TXT");
        DataInputStream indexFile = new DataInputStream(index);
        int number = indexFile.readInt();
        for (int i = 0; i < number; i++) {
            String productCode = file.readUTF();
            String title = file.readUTF();
            double price = file.readDouble();
            int quantity = file.readInt();
            myStack.push(new Product(productCode, title, price, quantity));
        }
        indexFile.close();
        file.close();
        System.out.println("Result:");
        for (int i = 0; i < number; i++) {
            System.out.println(myStack.pop());
        }
    }

    public void getFileToQueue() throws Exception {
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);

        FileInputStream index = new FileInputStream("INDEX.TXT");
        DataInputStream indexFile = new DataInputStream(index);
        int number = indexFile.readInt();
        for (int i = 0; i < number; i++) {
            String productCode = file.readUTF();
            String title = file.readUTF();
            double price = file.readDouble();
            int quantity = file.readInt();
            myQueue.enqueue(new Product(productCode, title, price, quantity));
        }
        file.close();
        indexFile.close();
        System.out.println("Result:");
        for (int i = 0; i < number; i++) {
            System.out.println(myQueue.dequeue());
        }
    }
}
