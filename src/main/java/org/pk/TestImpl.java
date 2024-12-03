package org.pk;

public class TestImpl {
    public static void main(String[] args) {

        Program[] pr = new Program[3];
        for (int i = 0; i < pr.length; i++) {
            pr[i] = new Program();
            pr[0].cal(0);
            pr[1].cal(1);
            pr[2].cal(2);

            System.out.println(pr[0].x + " " + pr[1].x + " " + pr[2].x);
        }
    }
}
