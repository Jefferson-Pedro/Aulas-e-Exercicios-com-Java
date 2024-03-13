package br.com.generation.controller;

import br.com.generation.builders.CCBuilder;
import br.com.generation.builders.CPBuilder;
import br.com.generation.model.Conta;
import br.com.generation.model.ContaCorrente;
import br.com.generation.model.ContaPoupanca;
import br.com.generation.repository.ContaRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class ContaController implements ContaRepository {

	String title;
	String msg;
	List<ContaPoupanca> cp = new ArrayList<ContaPoupanca>();
	List<ContaCorrente> cc = new ArrayList<ContaCorrente>();

	@Override
	public void procurarPorNumero(int numero) {

	}

	@Override
	public void listarTodas() {
		//System.out.println(cc.stream().forEach(););
	}

	@Override
	public void cadastrar() {
		final int[] escolha = new int[2];

		JPanel panel = new JPanel();
		JRadioButton button1 = new JRadioButton("Conta Corrente");
		JRadioButton button2 = new JRadioButton("Conta Poupança");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escolha[0] = 1;
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escolha[1] = 2;
			}
		});

		panel.add(button1);
		panel.add(button2);

		// Cria a caixa de diálogo com um título e os botões de rádio
		JOptionPane.showMessageDialog(null, panel, "Escolha o tipo de conta a ser criada:", JOptionPane.PLAIN_MESSAGE);

		if (escolha[0] == 1){
			ContaCorrente novaCC = new CCBuilder()
					.numero(001)
					.agencia(0001)
					.tipo(1)
					.titular("Jefferson Pedro")
					.saldo(0)
					.limite(1000)
					.criarContaCorrente();
			cc.add(novaCC);

			title = "Conta criada com sucesso!";
			msg = "Parabéns, sua conta corrente foi criada com sucesso, no banco Brazil com Z";

			JOptionPane.showMessageDialog(null, msg,title,JOptionPane.INFORMATION_MESSAGE);

		}else{
			ContaPoupanca novaCP = new CPBuilder()
					.numero(001)
					.agencia(1001)
					.tipo(1)
					.titular("Anna Thays")
					.saldo(0)
					.aniversario(25)
					.criarContaPoupanca();

			cp.add(novaCP);

			title = "Conta criada com sucesso!";
			msg = "Parabéns, sua conta poupança foi criada com sucesso, no banco Brazil com Z";

			JOptionPane.showMessageDialog(null, msg,title,JOptionPane.INFORMATION_MESSAGE);
		}

    }

	@Override
	public void atualizar() {
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));
		Optional<ContaCorrente> ccEncontrada = cc.stream()
				.filter(c -> c.getNumero() == numero)
				.findFirst();

		if (ccEncontrada.isPresent()){
			ContaCorrente cc = ccEncontrada.get();
			
		}
	}

	@Override
	public void deletar(int numero) {

	}

	@Override
	public void sacar(int numero, float valor) {

	}

	@Override
	public void depositar(int numero, float valor) {

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {

	}
}
