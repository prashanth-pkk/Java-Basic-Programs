package org.pk;

public class Program85 {
    public static void main(String[] args) {
        byte b[] = {65, 66, 67, 68, 69, 70};
        byte c[] = {71, 72, 73, 74, 75, 76};
        System.arraycopy(b, 2, c, 1, b.length - 2);
        System.out.println(new String(b) + " " + new String(c));
    }
}
