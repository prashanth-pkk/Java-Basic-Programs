package org.pk;

public class Program77 {
    public static void main(String[] args) {
        Q q = new Q();
        q.i = 1;
        q.j = 2;
        q.display();
    }
}

class P {
    int i;
}

class Q extends P {
    int j;

    void display() {
        super.i = j + 1;
        System.out.println(j + " " + i);
    }
}
