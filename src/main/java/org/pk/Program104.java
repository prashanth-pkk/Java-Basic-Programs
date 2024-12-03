package org.pk;

public class Program104 {
    public static void main(String[] args) {
        TestK k = new TestK();
        k.print(10);
    }
}

class TestK {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }
}