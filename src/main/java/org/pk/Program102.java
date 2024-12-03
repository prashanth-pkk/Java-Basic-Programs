package org.pk;

public class Program102 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        //square = shape;
        System.out.println(square.area());
    }
}

class Shape {
    public int area() {
        return 1;
    }
}

class Square extends Shape {
    public int area() {
        return 2;
    }
}
