package org.example;

public class ImprimirConRunnable  implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(Thread.currentThread().getName());
        }
    }

}
