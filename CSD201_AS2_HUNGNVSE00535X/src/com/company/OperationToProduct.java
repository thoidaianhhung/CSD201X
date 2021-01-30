package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * The OperationToProduct class
 * Purpose: provides method product management
 * Params: Product, Node, MyList, MyStack, MyQueue class.
 * returns: Main class.
 */

public class OperationToProduct {
    MyList myList = new MyList();
    MyStack myStack = new MyStack();
    MyQueue myQueue = new MyQueue();

    /**
     * The createProduct method
     * Purpose: import information product as product code, product name, price, quantity.
     */
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
        // call addLast method.
        addLast(productCode, title, price, quantity);
    }

    /**
     * The addLast method
     * purpose add 1 product the end linked list.
     * @param productCode
     * @param title
     * @param price
     * @param quantity
     */
    public void addLast(String productCode, String title, double price, int quantity) {
        myList.append(new Product(productCode, title, price, quantity));
    }

    /**
     *  The displayAll method
     *  Purpose displays information of products in the linked list
     */
    public void displayAll() {
        myList.printList();
    }

    /**
     *  The index method
     *  Purpose search index of element of product in Linked list
     *  param Node head, key
     *  return Element of product in Linked list, if not found then return-1
     */
    public void index() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the product code to search = ");
        String key = input.nextLine();
        System.out.println("Result:");
        Product result = myList.search(myList.head, key);

        // logic if there is a result, print it or else print -1
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("- 1");
        }
    }

    /**
     * The deleteByProductCode method
     * Purpose delete the first element of this key in Linked List
     * returns a element is removed from the linked list
     */
    public void deleteByProductCode() {
        System.out.print("Input the product code to delete = ");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        myList.deleteNode(key);
        displayAll();
        System.out.println("Delete!");
    }

    /**
     * The sortByProductCode method
     * Purpose sort elements in Linked List follow Quick Sort
     */
    public void sortByProductCode() {
        System.out.println("Result sort by product code:");
        Node n = myList.head;
        // Find the last node of the Linked list
        while (n.getNext() != null) {
            n = n.getNext();
        }
        myList.sort(myList.head, n);
        displayAll();
    }

    /**
     * The writeAllItemToFile method
     * purpose save the linked list products to file
     * @throws IOException
     */
    public void writeAllItemToFile() throws IOException {
        FileOutputStream f = new FileOutputStream("DATA.TXT");
        DataOutputStream file = new DataOutputStream(f);
        int number = 0;
        Node p = myList.head;
        // Browse the linked list nodes saved to the file
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

    /**
     * The getFileToLinkedList method
     * Purpose Reads data from the file and saves it to a linked list and displays a linked list
     * @throws IOException
     */
    public void getFileToLinkedList() throws IOException{
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);

        FileInputStream index = new FileInputStream("INDEX.TXT");
        DataInputStream indexFile = new DataInputStream(index);
        int number = indexFile.readInt();
        // reads data from the file, call addLast method.
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

    /**
     * The convertBinary method
     * Purpose express the quantity from the counter 10 to the binary counter.
     */
    public void convertBinary() {
        Node p = myList.head;
        int number = p.getInfo().getQuantity();
        System.out.println("The number of products render before the binary: " + number);
        System.out.println("The number of products render after the binary: " + myList.convertBinary(number));
    }

    /**
     * The getFileToStack method
     * Purpose read data from the file and save stack
     * @throws IOException
     */
    public void getFileToStack() throws IOException {
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);

        FileInputStream index = new FileInputStream("INDEX.TXT");
        DataInputStream indexFile = new DataInputStream(index);
        int number = indexFile.readInt();
        // reads data from the file, call push method in MyStack class
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
        // remove item from the stack
        for (int i = 0; i < number; i++) {
            System.out.println(myStack.pop());
        }
    }

    /**
     * The getFileToQueue method
     * purpose read data from the file and save queue
     * @throws Exception
     */
    public void getFileToQueue() throws Exception {
        FileInputStream f = new FileInputStream("DATA.TXT");
        DataInputStream file = new DataInputStream(f);

        FileInputStream index = new FileInputStream("INDEX.TXT");
        DataInputStream indexFile = new DataInputStream(index);
        int number = indexFile.readInt();
        // Read data from the file, call enqueue method add item into the queue
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
        // remove item from the queue
        for (int i = 0; i < number; i++) {
            System.out.println(myQueue.dequeue());
        }
    }
}
