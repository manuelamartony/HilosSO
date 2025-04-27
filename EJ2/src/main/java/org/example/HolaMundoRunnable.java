package org.example;

public class HolaMundoRunnable implements Runnable {
    private int numero;
    private String nombre;
    public HolaMundoRunnable(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public void run() {
        try {
            Thread.sleep(1000 * numero);
            System.out.println("Hola Mundo" + " " + Thread.currentThread().getName());
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

    }

}
