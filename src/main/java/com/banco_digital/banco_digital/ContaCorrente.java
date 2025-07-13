package com.banco_digital.banco_digital;

public class ContaCorrente extends Conta {
    public ContaCorrente(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println(String.format("Agencia : %d", super.agencia));
        System.out.println(String.format("Numero : %d", super.numero));
        System.out.println(String.format("Saldo : %.2f", super.saldo));
    }
}
