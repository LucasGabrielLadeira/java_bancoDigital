package com.banco_digital.banco_digital;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agencia {
    private static int AGENCIA_NUMERO = 1;
    private Banco banco;
    private int numero;
    private String endereco;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Agencia(String endereco, Banco banco) {
        this.numero = AGENCIA_NUMERO++;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.banco = banco;
        banco.adicionaAgencia(this);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void adicionarCliente(Cliente cliente)  {
        clientes.add(cliente);
    }

    public void listarTodosClientes(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}
