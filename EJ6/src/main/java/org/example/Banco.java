package org.example;

public class Banco extends Thread {
    int balance;
    public Banco(int balance, String str) {
        super(str);
        this.balance = balance;
    }
    public void getBalance() {
        System.out.println(Thread.currentThread().getName() + " balance: " + balance) ;
    }
    public void deposito(int valor) {
        balance += valor;
        System.out.println(Thread.currentThread().getName() + " depositó " + valor + " saldo " + balance);
    }
    public void withdrawal(int valorRetiro) {
        balance -= valorRetiro;
        System.out.println(Thread.currentThread().getName() + " retiró " + valorRetiro + " saldo " + balance);
    }
    public void run() {

        getBalance();
        deposito(300);
        getBalance();
        withdrawal(100);
        getBalance();

    }
    public static void main(String[] args) {
        Banco banco = new Banco(100,"Cliente 1");
        Banco banco2 = new Banco(200,"Cliente 2");
        Banco banco3 = new Banco(300,"Cliente 3");

        //start
        banco.start();
        banco2.start();
        banco3.start();

    }
}
