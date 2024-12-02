package org.pk;

public class Program51 {
    public static void main(String[] args) {
        int x = 2;
        int y = 0;
        for (; y < 10; y++) {
            if (y % x == 0) {
                continue;
            } else if (x == 8) {
                break;
            } else {
                System.out.print(y + " ");
            }
        }
    }
}
