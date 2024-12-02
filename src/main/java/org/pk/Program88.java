package org.pk;

import java.io.CharArrayReader;
import java.io.IOException;

public class Program88 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int length = s.length();
        char[] ch = s.toCharArray();
        s.getChars(0, length, ch, 0);
        CharArrayReader cr = new CharArrayReader(ch);
        CharArrayReader cr2 = new CharArrayReader(ch, 1, 3);
        int i;
        int j;
        try {
            while ((i = cr.read()) == (j = cr2.read())) {
                System.out.println(i + " " + j);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
