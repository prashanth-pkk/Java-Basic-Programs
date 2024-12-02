package org.pk;

public class Program62 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.cal(2, 3);
        System.out.println(d.x);
        d.print();
    }
}

class Demo1 {
    public int x;
    private int y;

    void cal(int a, int b) {
        x = a + 1;
        y = a;
    }

    void print() {
        System.out.println(y);
    }
}