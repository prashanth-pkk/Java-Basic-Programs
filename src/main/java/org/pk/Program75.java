package org.pk;

public class Program75 {
    public static void main(String[] args) {
        EE e = new EE();
        System.out.println(e.x + " " + e.y);
    }
}

class DD {
    public int x;
    public int y;

    DD() {
        x = 1;
        y = 2;
    }
}

class EE extends DD {
    int a;

    EE() {
        super();
    }
}