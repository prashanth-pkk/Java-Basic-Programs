package org.pk;

public class Program103 {
    public static void main(String[] args) {
        Derived d = new DerDerived();
    }
}

class Base {
    public Base() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("Derived");
    }
}

class DerDerived extends Derived {
    public DerDerived() {
        System.out.println("DerDerived");
    }
}