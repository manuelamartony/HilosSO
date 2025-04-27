package org.example;

public class SaludoRunnable implements Runnable {
    String nombre;
    public SaludoRunnable(String nombre) {
        this.nombre = nombre;
    }
    public void run() {
        System.out.println("\"¡Hola, soy el hilo de " + nombre + "!");
    }
    public static void main(String[] args) {
        new Thread(new SaludoRunnable("Manuela")).start();
        new Thread(new SaludoRunnable("Franco")).start();
        new Thread(new SaludoRunnable("Alejandra")).start();
        new Thread(new SaludoRunnable("Rodolfo")).start();
    }
}
