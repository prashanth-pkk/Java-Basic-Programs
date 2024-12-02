package org.pk;

public class Program83 {
    public static void main(String[] args) {
        Double d = new Double(1 / 0.0);
        boolean x = d.isInfinite();
        System.out.println(x);
    }
}
