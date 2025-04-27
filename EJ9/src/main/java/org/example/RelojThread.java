package org.example;

public class RelojThread extends Thread {
    private String nombre;
    private int tiempo;
    private int contador;
    public RelojThread(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000 + tiempo);
                contador++;
                System.out.println(nombre + " " + contador );
            }

        }catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        RelojThread rt = new RelojThread("Hilo 1", 0);
        RelojThread rt2 = new RelojThread("Hilo 2", 500);
        RelojThread rt3 = new RelojThread("Hilo 3", 1000);
        rt.start();
        rt2.start();
        rt3.start();
    }
}
