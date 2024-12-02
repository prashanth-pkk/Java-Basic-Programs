package org.pk;

public class Program90 {
    static void throwException() throws ArithmeticException{
        System.out.println("o");
        throw new ArithmeticException("Exception");
    }
    public static void main(String[] args) {
        try{
        throwException();
        }catch (ArithmeticException e){
            System.out.println("A");
        }
    }
}
