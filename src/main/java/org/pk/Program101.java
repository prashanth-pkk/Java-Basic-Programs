package org.pk;

public interface Program101 {
    int VAR = 0;

    void cal(int i);
}

class Program implements Program101 {
    int x;

    @Override
    public void cal(int i) {
        if (i < 2) {
            x = VAR;
        } else {
            x = i * i;
        }
    }
}
