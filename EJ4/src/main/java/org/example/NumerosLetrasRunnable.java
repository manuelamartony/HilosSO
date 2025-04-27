package org.example;

public class NumerosLetrasRunnable implements Runnable {
    int type;
    String abecedario = "abcdefghijklmnopqrstuvwxyz";
    public NumerosLetrasRunnable(int type) {
        this.type = type;
    }
    public void run() {
        if (type == 1) {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i);
            }
        } else if (type == 2) {
            for (int i = 1; i <= abecedario.length(); i++) {
                System.out.println(abecedario.charAt(i));
            }

        }

    }
}
class MainRunnable {
    public static void main(String[] args) {
        new Thread(new NumerosLetrasRunnable(1)).start();
        new Thread(new NumerosLetrasRunnable(2)).start();
    }
}
