package org.pk;

public class Program93 {
    public static void main(String[] args) {
        KK k = new KK();
        JJ j = new JJ();
        Class c;
        c = j.getClass();
        System.out.println(c.getSuperclass());
    }
}

class KK {
    int a;
    double b;
}

class JJ extends KK {
    int c;
}