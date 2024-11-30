package org.pk;

import java.util.ArrayList;

public class Program15 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("a");
        ar.add("b");
        ar.add("c");
        ar.add(1, "e");
        System.out.println(ar);
    }
}
