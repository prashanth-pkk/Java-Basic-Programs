package org.pk;

import java.math.BigDecimal;

public class Program23 {
    public static void main(String[] args) {
        double a = 0.02;
        double b = 0.03;
        double c = a-b;
        System.out.println(c);

        BigDecimal x = new BigDecimal(0.02);
        BigDecimal y = new BigDecimal(0.03);
        BigDecimal z = y.subtract(x);
        System.out.println(z);

    }
}
