package org.example;
import java.security.SecureRandom;

public class CarreraThread extends Thread{
    int posicion = 0;
    String nombre;
    public CarreraThread(String nombre){
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
        CarreraThread rt = new CarreraThread("Hilo 1");
        CarreraThread rt2 = new CarreraThread("Hilo 2");
        CarreraThread rt3 = new CarreraThread("Hilo 3");
        rt.start();
        rt2.start();
        rt3.start();

    }
}
