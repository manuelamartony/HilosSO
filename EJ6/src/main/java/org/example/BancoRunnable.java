package org.example;

public class BancoRunnable implements Runnable {
    int balance;
    String nombre;
    public BancoRunnable(int balance, String nombre) {
        this.balance = balance;
        this.nombre = nombre;
    }
    public void getBalance() {
        System.out.println(nombre + " balance: " + balance) ;
    }
    public void deposito(int valor) {
        balance += valor;
        System.out.println(nombre + " depositó " + valor + " saldo " + balance);
    }
    public void withdrawal(int valorRetiro) {
        balance -= valorRetiro;
        System.out.println(nombre + " retiró " + valorRetiro + " saldo " + balance);
    }
    public void run() {

        getBalance();
        deposito(300);
        getBalance();
        withdrawal(100);
        getBalance();

    }
    public static void main(String[] args) {
       new Thread(new BancoRunnable(100, "Cliente 1")).start();
       new Thread(new BancoRunnable(200, "Cliente 2")).start();
       new Thread(new BancoRunnable(300, "Cliente 3")).start();
    }
}
