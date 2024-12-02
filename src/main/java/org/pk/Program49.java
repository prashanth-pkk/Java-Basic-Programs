package org.pk;

public class Program49 {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 6;
        if ((v2 = 1) == v1) {
            System.out.println(v1);
        } else {
            System.out.println(++v2);
        }
    }
}
