package org.pk;

public class Program94 {
    public static void main(String[] args) {
        new T();
    }
}

class T implements Runnable {

    @Override
    public void run() {
        System.out.println("running...");
    }

    Thread t;

    T() {
        t = new Thread(new Thread(), "The thread");
        t.start();
    }
}
