package org.pk;

public class Program63 {
    public static void main(String[] args) {
        Pass p = new Pass();
        Pass p1 = new Pass();
        int a = 2;
        p.add(a, a + 1);
        p1.add(5, a);
        System.out.println(p.x + " " + p1.y);
    }
}

class Pass {
    static int x;
    static int y;

    void add(int a, int b) {
        x = a + b;
        y = x + b;
    }
}