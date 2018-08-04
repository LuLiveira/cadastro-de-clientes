package br.com.dev.lucas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.dev.lucas.modelo.Clientes;

public class TesteBusca {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Query query = em.createQuery("select c from Clientes c");
		@SuppressWarnings("unchecked")
		List<Clientes> clientes = query.getResultList();
		em.getTransaction().commit();
		em.close();
		emf.close();

		for (Clientes cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}

}
