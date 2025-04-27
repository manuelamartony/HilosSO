package org.example;

public class Main {
    public static void main(String[] args) {
        Thread hilo1 = new HilosNumerosLetras(1);
        Thread hilo2 = new HilosNumerosLetras(2);
        hilo1.start();
        hilo2.start();
    }
}