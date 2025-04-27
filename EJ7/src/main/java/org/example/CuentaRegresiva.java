package org.example;

public class CuentaRegresiva extends Thread {

    private String nombre;
    public CuentaRegresiva(String nombre) {
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
        CuentaRegresiva hilo1 = new CuentaRegresiva("Hilo 1");
        CuentaRegresiva hilo2 = new CuentaRegresiva("Hilo 2");
        CuentaRegresiva hilo3 = new CuentaRegresiva("Hilo 3");
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
