package org.pk;

public class Program28 {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.calculate(0, 1));
    }
}

class A {
    final public int calculate(int a, int b) {
        return 1;
    }
}

class B extends A {
/*    public int calculate(int a, int b) {
        return 2;
    }*/
}
