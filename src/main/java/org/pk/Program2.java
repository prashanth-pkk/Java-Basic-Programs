package org.pk;

class Box {
    int length;
    int width;
    int height;
}

public class Program2 {

    public static void main(String[] args) {
        Box b = new Box();
        b.length = 10;
        b.width = 2;
        b.height = 10;
        int res = b.length * b.width * b.height;
        System.out.println(res);
    }
}
