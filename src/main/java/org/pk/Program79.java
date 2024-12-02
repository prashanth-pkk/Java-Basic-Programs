package org.pk;

public class Program79 {
    public static void main(String[] args) {
        String s = "Hello java programming";
        int start = 3;
        int end = 7;
        char[] ch = new char[end - start];
        s.getChars(start, end, ch, 0);
        System.out.println(ch);
    }
}
