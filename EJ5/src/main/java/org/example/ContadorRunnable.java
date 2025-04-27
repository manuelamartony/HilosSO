package org.example;

public class ContadorRunnable implements Runnable {
    int contador;
    int max;

    public ContadorRunnable( int contador, int max) {

        this.contador = contador;
        this.max = max;
    }

    public void run() {
        for (int i = 0; i < max; i++) {
            contador++;
            System.out.println(contador + " " + Thread.currentThread().getName());

        }

    }
    public static void main(String[] args) {
        new Thread(new ContadorRunnable(0,5)).start();
        new Thread(new ContadorRunnable(0,5)).start();
        new Thread(new ContadorRunnable(0,5)).start();
        new Thread(new ContadorRunnable(0,5)).start();
    }
}
