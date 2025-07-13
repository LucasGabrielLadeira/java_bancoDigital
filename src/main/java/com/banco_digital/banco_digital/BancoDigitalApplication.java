package com.banco_digital.banco_digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
		Banco banco = new Banco("Banco do Brasil");
        Agencia agencia = new Agencia("Rua Portugal, 103", banco);
        Cliente cliente = new Cliente(agencia, "Joao");
        Cliente cliente2 = new Cliente(agencia, "Lucas");
        ContaCorrente conta = new ContaCorrente(agencia, cliente);
        ContaCorrente conta2 = new ContaCorrente(agencia, cliente2);
        conta.depositar(1000);
        conta2.depositar(500);
        conta.transferir(200, conta2);
        conta.imprimirExtrato();
        conta2.imprimirExtrato();
        banco.listarTodasAgencias();
        banco.listarTodosClientes();
	}

}
