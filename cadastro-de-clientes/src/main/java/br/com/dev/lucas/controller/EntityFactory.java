package br.com.dev.lucas.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {

	public EntityManager getConnection() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager mananger = emf.createEntityManager();
		return mananger;
	}

}
