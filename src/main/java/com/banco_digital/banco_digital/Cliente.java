package com.banco_digital.banco_digital;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente {
    private String nome;
    private Agencia agencia;
    private List<Conta> Contas;

    public Cliente(Agencia agencia, String nome) {
        this.agencia = agencia;
        this.nome = nome;
        agencia.adicionarCliente(this);
    }
}
