package org.pk;

public class Program106 {
    public void demo(int i) {
        System.out.println("int");
    }

    public void demo() {
        System.out.println("short");
    }

    public static void main(String[] args) {
        Short s = 2;
        Program106 p = new Program106();
        p.demo(s);
    }
}
