package org.pk;

public class Program58 {
    public static void main(String[] args) {
        Z z = new Z();
        z.cal(2,3);
       // System.out.println(z.x+" "+z.y);
    }
}
class Z{
    public int x;
    private int y;

    void cal(int a, int b){
        x = a+1;
        y =b;
    }
}
