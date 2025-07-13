package com.banco_digital.banco_digital;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println(String.format("Agencia : %d", super.agencia));
        System.out.println(String.format("Numero : %d", super.numero));
        System.out.println(String.format("Saldo :  %.2f", super.saldo));
    }
}
