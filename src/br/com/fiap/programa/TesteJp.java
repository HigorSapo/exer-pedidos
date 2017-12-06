package br.com.fiap.programa;

import javax.swing.JOptionPane;

public class TesteJp {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de pedidos :-)");
		JOptionPane.showMessageDialog(null, "Para cameçar, vamos cadastrar um cliente!");
		
		String nomeCliente;
		int resposta;
		int sentinela = 1;
		
		while (sentinela == 1) {
			nomeCliente = JOptionPane.showInputDialog("Preencha o nome do cliente:");
			JOptionPane.showMessageDialog(null, "Cliente " + nomeCliente + " cadastrado com sucesso!");
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo cliente?");
			if (resposta == JOptionPane.YES_OPTION) {
				nomeCliente = JOptionPane.showInputDialog("Preencha o nome do cliente:");
				JOptionPane.showMessageDialog(null, "Cliente " + nomeCliente + " cadastrado com sucesso!");
			} else {
				sentinela = 0;
			}
			
		}
	}

}
