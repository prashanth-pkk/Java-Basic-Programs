package org.pk;

public class Program67 {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Program67 p = new Program67();
        System.out.println(p.fact(5));
    }
}
