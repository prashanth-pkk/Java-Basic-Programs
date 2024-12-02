package org.pk;

public class Program68 {
    int fun(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fun(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Program68 p = new Program68();
        System.out.println(p.fun(1));
    }
}
