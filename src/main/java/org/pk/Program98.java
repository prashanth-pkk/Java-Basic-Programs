package org.pk;

public class Program98 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new NullPointerException("hello");
        }catch (ArithmeticException e){
            System.out.println("B");
        }
    }
}
