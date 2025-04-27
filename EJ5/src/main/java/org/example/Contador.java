package org.example;

public class Contador extends Thread {
    int contador;
    int max;

    public Contador(String str, int contador, int max) {
        super(str);
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
        Contador contador = new Contador("Hilo1", 0, 5);
        Contador contador2 = new Contador("Hilo2", 0, 5);
        Contador contador3 = new Contador("Hilo3", 0, 5);
        Contador contador4 = new Contador("Hilo4", 0, 5);
        contador.start();
        contador2.start();
        contador3.start();
        contador4.start();
    }

}