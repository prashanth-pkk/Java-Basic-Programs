package org.pk;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Program14 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(8);
        ll.add(new Integer(7));
        ll.add(new Integer(1));
        Iterator it = ll.iterator();
        Collections.reverse(ll);
        Collections.sort(ll);
        System.out.println(ll);
    }
}
