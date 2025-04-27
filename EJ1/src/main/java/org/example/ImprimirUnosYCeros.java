package org.example;

public class ImprimirUnosYCeros {
    public static void main(String[] args) {
        Thread hilos0 = new Hilos(0,1000);
        Thread hilos1 = new Hilos(1,1000);
        hilos0.start();
        hilos1.start();
    }

    static class Hilos extends Thread {
        private int numero;
        private int repeticiones;

        public Hilos(int numero, int repeticiones) {
            this.numero = numero;
            this.repeticiones = repeticiones;
        }

        public void run() {
            for (int i = 0; i <= repeticiones; i++) {
                System.out.print(numero);
            }
        }
    }
}