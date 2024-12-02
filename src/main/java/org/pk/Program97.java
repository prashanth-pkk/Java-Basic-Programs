package org.pk;

public class Program97 {
    public static void main(String[] args) {
        try {
            int i, sum = 10;
            for (i = -1; i < 3; i++) {
                sum = sum / i;
                System.out.println(sum);
            }

        } catch (ArithmeticException e) {
            System.out.println("o");
        }
    }
}
