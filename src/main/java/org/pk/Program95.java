package org.pk;

import java.util.BitSet;

public class Program95 {
    public static void main(String[] args) {
        BitSet set = new BitSet(5);
        for (int i = 0; i < 5; i++) {
            set.set(i);
            set.clear(2);
        }
        System.out.println(set.length() + " " + set.size());
        System.out.println(set.get(3));
    }
}
