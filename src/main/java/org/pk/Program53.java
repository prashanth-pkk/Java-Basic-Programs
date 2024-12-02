package org.pk;

public class Program53 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        first:
        {
            second:
            {
                third:
                {
                    if (a == b >> 1)
                        break second;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
