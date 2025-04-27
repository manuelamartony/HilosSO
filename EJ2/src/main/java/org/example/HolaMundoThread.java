package org.example;

public class HolaMundoThread extends Thread {
    int numero;
    public HolaMundoThread(String str, int numero) {
        super(str);
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
    public static void main(String[] args) {
        Thread hilo1 = new HolaMundoThread("Hilo 1",1);
        Thread hilo2 = new HolaMundoThread("Hilo 2",2);
        Thread hilo3 = new HolaMundoThread("Hilo 3",3);
        Thread hilo4 = new HolaMundoThread("Hilo 4",4);
        Thread hilo5 = new HolaMundoThread("Hilo 5",5);
        Thread hilo6 = new HolaMundoThread("Hilo 6",6);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
    }
}
