package org.example;

public class Main {
    public static void main(String[] args) {
        new Thread(new HolaMundoRunnable("Hilo 1",1)).start();
        new Thread(new HolaMundoRunnable("Hilo 2",2)).start();
        new Thread(new HolaMundoRunnable("Hilo 3",3)).start();
        new Thread(new HolaMundoRunnable("Hilo 4",4)).start();
        new Thread(new HolaMundoRunnable("Hilo 5",5)).start();
        new Thread(new HolaMundoRunnable("Hilo 6",6)).start();
    }
}