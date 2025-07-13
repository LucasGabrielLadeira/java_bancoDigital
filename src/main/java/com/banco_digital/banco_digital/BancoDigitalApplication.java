package com.banco_digital.banco_digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
		Banco banco = new Banco("Banco do Brasil");
        Agencia agencia = new Agencia("Rua Portugal, 103", banco);
        Agencia agencia2 = new Agencia("Rua Pedras de Março, 256", banco);
        Cliente cliente = new Cliente(agencia, "Joao");
        Cliente cliente2 = new Cliente(agencia, "Lucas");
        Cliente cliente3 = new Cliente(agencia2, "Flavio");
        Cliente cliente4 = new Cliente(agencia2, "Otavio");
        Cliente cliente5 = new Cliente(agencia, "Marcelo");
        ContaCorrente conta = new ContaCorrente(agencia, cliente);
        ContaCorrente conta2 = new ContaCorrente(agencia, cliente2);
        conta.depositar(1000);
        conta2.depositar(500);
        conta.transferir(200, conta2);
        System.out.println("==========");
        conta.imprimirExtrato();
        System.out.println("==========");
        conta2.imprimirExtrato();
        System.out.println("==========");
        banco.listarTodasAgencias();
        System.out.println("==========");
        banco.listarTodosClientes();
        System.out.println("==========");
        agencia.listarTodosClientes();
        System.out.println("==========");
        agencia2.listarTodosClientes();
	}

}
