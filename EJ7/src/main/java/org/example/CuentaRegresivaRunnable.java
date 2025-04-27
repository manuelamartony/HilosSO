package org.example;

public class CuentaRegresivaRunnable implements Runnable {
    private String nombre;
    public CuentaRegresivaRunnable(String nombre) {
        this.nombre = nombre;
    }
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                Thread.sleep(1000);
                System.out.println(nombre + " " + i );
            }

        }catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Thread(new CuentaRegresivaRunnable("Hilo 1")).start();
        new Thread(new CuentaRegresivaRunnable("Hilo 2")).start();
        new Thread(new CuentaRegresivaRunnable("Hilo 3")).start();

    }
}
