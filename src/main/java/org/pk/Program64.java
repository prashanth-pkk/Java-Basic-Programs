package org.pk;

public class Program64 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.x = 5;
        t.y = 5;
        System.out.println(t.isEqual());
    }
}

class Test2 {
    int x;
    int y;

    boolean isEqual() {
        return (x == y);
    }
}
