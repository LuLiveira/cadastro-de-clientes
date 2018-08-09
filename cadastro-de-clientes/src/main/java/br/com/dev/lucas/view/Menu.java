package br.com.dev.lucas.view;

import java.util.Scanner;

import br.com.dev.lucas.controller.EntityFactory;
import br.com.dev.lucas.dao.ClienteDAO;
import br.com.dev.lucas.modelo.Clientes;

public class Menu {

	public static void main(String[] args) {

		boolean menu = true;

		do {

			System.out.println("##########MENU##########");
			System.out.println("1 - CADASTRAR NOVO CLIENTE");
			System.out.println("2 - ALTERAR UM CLIENTE");
			System.out.println("3 - REMOVER UM CLIENTE");
			System.out.println("4 - BUSCAR UM CLIENTE");
			System.out.println("5 - LISTAR TODOS OS CLIENTES");
			System.out.println("6 - SAIR DO MENU");

			Scanner teclado = new Scanner(System.in);

			System.out.print("Qual o numero da opção? ");
			int valor = teclado.nextInt();
			switch (valor) {

			case 1:
				System.out.println("Você selecionou a opção: " + valor);
				System.out.print("Digite o nome do cliente: ");
				String nome = teclado.next();

				System.out.print("Digite a idade do cliente: ");
				teclado.nextLine();
				Integer idade = teclado.nextInt();

				System.out.print("Digite o endereço do cliente: ");
				String rua = teclado.next();

				System.out.print("Digite o bairro do cliente: ");
				String bairro = teclado.next();

				System.out.print("Digite o telefone do cliente: ");
				String telefone = teclado.next();

				new ClienteDAO(new EntityFactory().getConnection()).adiciona(new Clientes(nome, idade, rua, bairro, telefone));

			}

		} while (menu);

	}

}
