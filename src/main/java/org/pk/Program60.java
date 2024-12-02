package org.pk;

public class Program60 {
    public static void main(String[] args) {
        Output op = new Output();
        int a = 10;
        int b = 20;
        op.Output(a, b);
        System.out.println(a + " " + b);
    }
}

class Output {
    int a;
    int b;

    void Output(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
