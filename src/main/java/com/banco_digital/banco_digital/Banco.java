package com.banco_digital.banco_digital;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public void adicionaAgencia(Agencia agencia) {
        this.agencias.add(agencia);
    }

    public void listarTodasAgencias(){
        for (Agencia agencia : this.agencias) {
            System.out.println(agencia.getNumero());
        }
    }

    public void listarTodosClientes(){
        for (Agencia agencia : this.agencias) {
            agencia.listarTodosClientes();
        }
    }
}
