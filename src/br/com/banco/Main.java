package br.com.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José da Silva");


        Conta cc = new ContaCorrente(1, 1001, cliente);
        Conta cp = new ContaPoupanca(1, 1002, cliente);

        cc.depositar(1000);
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
