package org.pk;

public class Program6 {
    public int recursion(int n) {
        int res;
        if (n == 1) {
            return 1;
        }
        res = recursion(n - 1);
        return res;
    }

    public static void main(String[] args) {
        Program6 pr = new Program6();
        System.out.println(pr.recursion(5));
    }
}
