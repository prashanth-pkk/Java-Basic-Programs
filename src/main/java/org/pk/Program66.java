package org.pk;

public class Program66 {
    int fun(int n) {
        int result;
        result = fun(n - 1);
        return result;
    }

    public static void main(String[] args) {
        Program66 p = new Program66();
        System.out.println(p.fun(5));
    }
}
