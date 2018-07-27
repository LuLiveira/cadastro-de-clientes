package br.com.dev.lucas.dao;

import javax.persistence.EntityManager;

import br.com.dev.lucas.modelo.Clientes;

public class ClienteDAO {

	private EntityManager connection;

	public ClienteDAO(EntityManager connection) {
		this.connection = connection;
	}

	public void adiciona(Clientes cliente) {
		connection.getTransaction().begin();
		connection.persist(cliente);
		connection.getTransaction().commit();
		connection.close();
	}

}
