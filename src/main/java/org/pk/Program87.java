package org.pk;

public class Program87 {
    public static void main(String[] args) {
        Double y = new Double(257.974587487457);
        Double i = new Double(257.97458);
        try {
            int x = y.compareTo(i);
            System.out.println(x);
        } catch (ClassCastException e) {
            System.out.println("Exception");
        }
    }
}
