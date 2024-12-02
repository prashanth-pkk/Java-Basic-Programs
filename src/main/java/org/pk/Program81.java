package org.pk;

public class Program81 {
    public static void main(String[] args) {
        String[] st = {"a", "b", "c", "d", "d", "e"};
        for (int i = 0; i < st.length; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if (st[i] == st[j]) {
                    System.out.println(st[i] + " ");
                }
            }
        }
    }
}
