package br.com.fiap.programa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Itens;
import br.com.fiap.entity.Pedidos;
import br.com.fiap.helper.PedidosHelper;

public class TestePedidos {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactoty = 
				Persistence.createEntityManagerFactory("pedidos1-final");
		
		EntityManager entityManager = 
				entityManagerFactoty.createEntityManager();
		
		PedidosHelper dao = new PedidosHelper(entityManager);
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de pedidos :-)");
		
		JOptionPane.showMessageDialog(null, "Para cameçar, vamos cadastrar um cliente!");
		String nomeCli = JOptionPane.showInputDialog("Preencha o nome do cliente:");
		String emailCli = JOptionPane.showInputDialog("Preencha o Email do cliente:");
		
		Clientes cli1 = new Clientes();
		cli1.setNome(nomeCli);
		cli1.setEmail(emailCli);
		System.out.println(dao.salvar(cli1));
		
		JOptionPane.showMessageDialog(null, "Agora cadastre um produto!");
		String descP = JOptionPane.showInputDialog("Preencha a descrição do produto:");
		String valorP = JOptionPane.showInputDialog("Preencha o valor do produto:");
		double valorPDouble = Double.parseDouble(valorP);
		
		Pedidos p1 = new Pedidos();
		p1.setData(new Date());
		p1.setDescricao(descP);
		p1.setValor(valorPDouble);
		p1.setClientes(cli1);
		System.out.println(dao.salvar(p1));
		
		JOptionPane.showMessageDialog(null, "Agora cadastre um item do produto!");
		String descI1 = JOptionPane.showInputDialog("Preencha a descrição do item:");
		String descI2 = JOptionPane.showInputDialog("Preencha a descrição do segundo item:");
		
		Itens i1 = new Itens();
		i1.setDescricao(descI1);
		i1.setPedidos(p1);
		System.out.println(dao.salvar(i1));
		
		Itens i2 = new Itens();
		i2.setDescricao(descI2);
		i2.setPedidos(p1);
		System.out.println(dao.salvar(i2));
		
		JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!!!");
		
	}

}
