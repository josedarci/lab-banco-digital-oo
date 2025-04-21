package br.com.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + saldo);
    }
}
