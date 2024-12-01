package org.pk;

public class Program29 {
    public static void main(String[] args) {
        String[][] argument = new String[2][2];
        int x;
        argument[0] = args;
        x = argument[0].length;
        for (int i = 0; i < x; i++) {
            System.out.println(argument[0][i]);
        }
    }
}
