package br.com.banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + saldo);
    }
}
