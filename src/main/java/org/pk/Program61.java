package org.pk;

public class Program61 {
    public static void main(String[] args) {
        Output1 op = new Output1(10, 20);
        op.math(op);
        System.out.println(op.a + " " + op.b);
    }
}

class Output1 {
    int a;
    int b;

    Output1(int i, int j) {
        a = i;
        b = j;
    }

    void math(Output1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
