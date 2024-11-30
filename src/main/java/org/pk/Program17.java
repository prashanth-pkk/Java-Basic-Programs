package org.pk;

public class Program17 {
    public static void main(String[] args) {
        double[] num = {1, 2.6, 6.9, 8.1};
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        System.out.println(result);
    }
}
