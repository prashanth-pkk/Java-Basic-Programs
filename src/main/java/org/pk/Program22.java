package org.pk;

public enum Program22 {
    A, B, C,D,E;

    private Program22() {
        System.out.println(10);
    }

    public static void main(String[] args) {
        Program22 pr = Program22.B;
    }
}
