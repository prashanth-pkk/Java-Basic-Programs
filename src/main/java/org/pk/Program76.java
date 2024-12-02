package org.pk;

public class Program76 {
    public static void main(String[] args) {
        J j = new J();
        j.a=1;
        j.b=2;
        j.display();
    }
}

class K {
    int a;

    void display() {
        System.out.println(a);
    }
}

class J extends K {
    int b;

    void display() {
        System.out.println(b);
    }
}