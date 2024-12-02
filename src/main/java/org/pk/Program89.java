package org.pk;

public class Program89 {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3, 4, 5};
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            int x = 1 / 0;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("a");
        } catch (ArithmeticException e) {
            System.out.println("b");
        }
    }
}
