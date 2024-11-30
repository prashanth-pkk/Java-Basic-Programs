package org.pk;

public class Program1 {
    public static void main(String[] args) {
        int x=5;
        {
            int y=6;
            System.out.println(x+" "+y);
        }
      //  System.out.println(x+" "+y); // compile time error

        //the block scope is limited
    }
}
