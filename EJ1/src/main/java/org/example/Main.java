package org.example;

public class Main {
    public static void main(String[] args){
        new Thread(new ImprimirConRunnable(),"1").start();
        new Thread(new ImprimirConRunnable(),"0").start();
    }
}