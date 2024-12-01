package org.pk;

public class Program40 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        b++;
        ++a;
        System.out.println(a + " " + b + " " + c);
    }
}
