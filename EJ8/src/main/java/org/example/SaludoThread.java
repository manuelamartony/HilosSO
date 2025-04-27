package org.example;

public class SaludoThread  extends Thread{
    String nombre;
    public SaludoThread(String nombre) {
        this.nombre = nombre;
    }
    public void run() {
        System.out.println("\"¡Hola, soy el hilo de " + nombre + "!");
    }
    public static void main(String[] args) {
        SaludoThread saludo = new SaludoThread("Manuela");
        SaludoThread saludo2 = new SaludoThread("Franco");
        SaludoThread saludo3 = new SaludoThread("Alejandra");
        SaludoThread saludo4 = new SaludoThread("Rodolfo");
        saludo.start();
        saludo2.start();
        saludo3.start();
        saludo4.start();
    }
}
