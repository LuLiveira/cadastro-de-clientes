package br.com.dev.lucas.teste;

import javax.persistence.EntityManager;

import br.com.dev.lucas.controller.EntityFactory;
import br.com.dev.lucas.dao.ClienteDAO;
import br.com.dev.lucas.modelo.Clientes;

public class TesteHibernate {

	public static void main(String[] args) {

		Clientes cliente = new Clientes("Lucas", 21, "Rua Pastor Alberto Augusto, 484", "982237209");

		EntityManager connection = new EntityFactory().getConnection();

		new ClienteDAO(connection).adiciona(cliente);

	}

}
