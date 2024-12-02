package org.pk;

public class Program65 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        Demo3 d1 = new Demo3();
        d.x = 0;
        d.increment();
        d1.increment();
        System.out.println(d.x + " " + d1.x);
    }
}

class Demo3 {
    static int x;

    void increment() {
        x++;
    }
}