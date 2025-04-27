package org.example;

public class ContadorThread extends Thread {
    private static int contador = 0;
    public ContadorThread() {
    }
    public void run() {
        for (int i = 0; i < 5000
                ; i++) {
            contador++;
        }
        System.out.println(contador);
    }
    public static void main(String[] args) {
        Thread hilo1 = new ContadorThread();
        Thread hilo2 = new ContadorThread();
        Thread hilo3 = new ContadorThread();
        Thread hilo4 = new ContadorThread();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
