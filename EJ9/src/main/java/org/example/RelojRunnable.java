package org.example;

public class RelojRunnable implements Runnable {
    private String nombre;
    private int tiempo;
    private int contador;

    public RelojRunnable(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000 + tiempo);
                contador++;
                System.out.println(nombre + " " + contador);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        new RelojThread("Hilo 1", 0).start();
        new RelojThread("Hilo 2", 500).start();
        new RelojThread("Hilo 3", 1000).start();

    }
}