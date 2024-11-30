package org.pk;

public class Program16 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int a = 2;
        double b = 3.2;
        d.add(a, b);
        d.add(a, b);
        System.out.println(d.x + " " + d.y);
    }
}

class Demo {
    int x, y;

    void add(int a, int b) {
        x = a + b;
    }

    void add(double a, double b) {
        y = (int) (a + b);
    }

    Demo() {
        this.x = 0;
        this.y = 0;
    }
}