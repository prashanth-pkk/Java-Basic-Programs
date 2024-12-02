package org.pk;

public class Program72 {
    public static void main(String[] args) {
        CB obj = new CB();
        obj.j = 2;
        obj.display();
    }
}

abstract class AB {
    int i;

    abstract void display();
}

class CB extends AB {

    int j;

    @Override
    void display() {
        System.out.println(j);
    }
}