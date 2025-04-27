package org.example;
import java.security.SecureRandom;

public class CarreraRunnable implements Runnable{
    int posicion = 0;
    String nombre;
    public CarreraRunnable(String nombre){
        this.nombre = nombre;
    }
    public void run(){
        SecureRandom secureRandom = new SecureRandom();
        while(posicion < 100){
            int numAleatorio = secureRandom.nextInt(10);
            posicion = posicion + numAleatorio;
            System.out.println(nombre + " - " + posicion);
        }
        System.out.println(nombre + " Carrera terminada");
    }
    public static void main(String[] args){
      new CarreraRunnable("Hilo 1").run();
      new CarreraRunnable("Hilo 2").run();
      new CarreraRunnable("Hilo 3").run();

    }
}
