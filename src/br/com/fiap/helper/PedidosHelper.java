package br.com.fiap.helper;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Itens;
import br.com.fiap.entity.Pedidos;

public class PedidosHelper {

	private EntityManager em;
	
	public PedidosHelper(EntityManager em) {
		this.em = em;
	}
	
	public String salvar(Clientes clientes) {
		try {
			em.getTransaction().begin();
			em.persist(clientes);
			em.getTransaction().commit();
			return "Clientes salvo!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String salvar(Pedidos pedidos) {
		try {
			em.getTransaction().begin();
			em.persist(pedidos);
			em.getTransaction().commit();
			return "Pedidos salvo!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String salvar(Itens itens) {
		try {
			em.getTransaction().begin();
			em.persist(itens);
			em.getTransaction().commit();
			return "Itens salvo!";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
}
