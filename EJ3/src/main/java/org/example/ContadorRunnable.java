package org.example;

public class ContadorRunnable implements Runnable {
    private static int contador = 0;
    public ContadorRunnable() {
    }
    public void run() {
        for (int i = 0; i < 5000
                ; i++) {
            contador++;
        }
        System.out.println(contador);
    }
    public static void main(String[] args) {
        new Thread(new ContadorRunnable()).start();
        new Thread(new ContadorRunnable()).start();
        new Thread(new ContadorRunnable()).start();
    }
}
