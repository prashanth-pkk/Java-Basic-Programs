package org.pk;

public class Program56 {
    public static void main(String[] args) {
        Area area = new Area();
        area.voulme();
        System.out.println(area.volume);
    }
}

class Area {
    int width;
    int length;
    int volume;

    Area() {
        width = 5;
        length = 6;
    }

    void voulme() {
   //     volume = width * length * height;
    }
}