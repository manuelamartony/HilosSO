package org.example;

public class HilosNumerosLetras extends Thread {
    int tipo;
    public String abecedario = "abcdefghijklmnopqrstuvwxyz";

    public HilosNumerosLetras(int tipo) {
        this.tipo = tipo;
    }

    public void run() {
        if (tipo == 1) {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i);
            }
        }
        if (tipo == 2) {
            for (int i = 1; i <= abecedario.length(); i++) {
                System.out.println(abecedario.charAt(i));
            }
        }
    }
}
