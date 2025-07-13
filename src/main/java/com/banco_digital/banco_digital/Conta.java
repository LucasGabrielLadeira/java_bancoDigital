package com.banco_digital.banco_digital;

public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente titular;

    public Conta(Agencia agencia, Cliente cliente) {
        this.agencia = agencia.getNumero();
        this.titular = cliente;
        this.numero = SEQUENCIAL++;
        agencia.adicionarConta(this);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
    public void imprimirExtrato(){

    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
