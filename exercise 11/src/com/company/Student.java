package com.company;

public class Student {
    public int ID;
    public String name;
    public float grad1, grad2, grad3;

    public Student() {}

    public Student(int ID, String name, float grad1, float grad2, float grad3) {
        this.ID = ID;
        this.name = name;
        this.grad1 = grad1;
        this.grad2 = grad2;
        this.grad3 = grad3;
    }

    public String toString() {
        return String.format("%20d%20s%20f%20f%20f", ID, name, grad1, grad2, grad3);
    }
}
