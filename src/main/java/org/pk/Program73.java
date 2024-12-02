package org.pk;

public class Program73 {
    int i = 1;
    int j = 2;

    public Program73() {
        i = 1;
        j = 2;
    }

    public static void main(String[] args) {

        Program73 p = new Program73();
        Program73 p1 = new Program73();
        System.out.println(p.equals(p1));
    }
}
