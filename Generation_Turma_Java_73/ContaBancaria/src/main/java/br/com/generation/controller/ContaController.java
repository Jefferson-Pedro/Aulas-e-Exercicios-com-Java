package br.com.generation.controller;

import br.com.generation.builders.CCBuilder;
import br.com.generation.builders.CPBuilder;
import br.com.generation.model.Conta;
import br.com.generation.model.ContaCorrente;
import br.com.generation.model.ContaPoupanca;
import br.com.generation.repository.ContaRepository;
import br.com.generation.util.Cores;

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
	public void procurarPorNumero() {

		Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta (1- Conta Corrente ou 2- Conta Poupança):"));
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));

		switch (escolha) {
			case 1:
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == numero)
						contaCorrente.visualizar();
				}
				break;

			case 2:
				for (int j = 0; j < cp.size(); j++) {
					ContaPoupanca contaPoupanca = cp.get(j);
					if (contaPoupanca.getNumero() == numero)
						contaPoupanca.visualizar();
				}
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}

	@Override
	public void listarTodas() {
		System.out.println("************************ CONTAS CORRENTES *****************************");
		cc.forEach(ContaCorrente::visualizar);
		System.out.println("************************ CONTAS POUPANÇAS *****************************");
		cp.forEach(ContaPoupanca::visualizar);
	}

	@Override
	public void cadastrar() {
		final int[] escolha = new int[2];
		String status = "CRIAR";

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

		if (escolha[0] == 1) {

			ContaCorrente contaCorrente = criaOuAtualizaContaCC(status);

			if (contaCorrente != null) {
				cc.add(contaCorrente);

				title = "Conta criada com sucesso!";
				msg = "Parabéns, sua conta corrente foi criada com sucesso, no banco Brazil com Z";
				JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);

			}else{
				System.err.println("Erro, conta não criada.");
			}

		} else {
			ContaPoupanca contaPoupanca = criaOuAtualizaContaCP(status);

			if (contaPoupanca != null) {
				cp.add(contaPoupanca);

				title = "Conta criada com sucesso!";
				msg = "Parabéns, sua conta poupança foi criada com sucesso, no banco Brazil com Z";
				JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);

			}else{
				System.err.println("Erro, conta não criada.");
			}

			JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	@Override
	public void atualizar() {
		String status = "ATUALIZAR";
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));
		Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta (1- Conta Corrente ou 2- Conta Poupança):"));

		switch (escolha) {
			case 1:
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == numero) {

						ContaCorrente contaCorrenteAtualizada = criaOuAtualizaContaCC(status);

						if (contaCorrenteAtualizada != null) {

							cc.set(i, contaCorrenteAtualizada);
							System.out.println("Conta atualizada com sucesso!");

						} else {
							System.err.println("Erro ao atualizar a conta.");
						}
						break;
					}
				}
				break;

			case 2:
				for (int i = 0; i < cp.size(); i++) {
					ContaPoupanca contaPoupanca = cp.get(i);
					if (contaPoupanca.getNumero() == numero) {

						ContaPoupanca contaPoupancaAtualizada = criaOuAtualizaContaCP(status);

						if (contaPoupancaAtualizada != null) {

							cp.set(i, contaPoupancaAtualizada);
							System.out.println("Conta atualizada com sucesso!");

						} else {
							System.err.println("Erro ao atualizar a conta.");
						}
						break;
					}
				}
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}
	@Override
	public void deletar() {
		Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta (1- Conta Corrente ou 2- Conta Poupança):"));
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));

		switch (escolha) {
			case 1:
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == numero) {
						cc.remove(i);
						JOptionPane.showMessageDialog(null, "Conta deletada com sucesso!",
								"Erro", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				JOptionPane.showMessageDialog(null, "Conta não encontrada!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;

			case 2:
				for (int j = 0; j < cp.size(); j++) {
					ContaPoupanca contaPoupanca = cp.get(j);
					if (contaPoupanca.getNumero() == numero) {
						cc.remove(j);
						JOptionPane.showMessageDialog(null, "Conta deletada com sucesso!",
								"Erro", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				JOptionPane.showMessageDialog(null, "Conta não encontrada!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}
	@Override
	public void sacar() {
		Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta (1- Conta Corrente ou 2- Conta Poupança):"));
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));
		Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da conta a ser sacada:"));

		switch (escolha) {
			case 1:
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == numero){
						contaCorrente.sacar(valor);
						cc.set(i, contaCorrente);
					}

				}
				break;

			case 2:
				for (int j = 0; j < cp.size(); j++) {
					ContaPoupanca contaPoupanca = cp.get(j);
					if (contaPoupanca.getNumero() == numero){
						contaPoupanca.sacar(valor);
						cp.set(j, contaPoupanca);
					}
				}
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}
	@Override
	public void depositar() {
		Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta (1- Conta Corrente ou 2- Conta Poupança):"));
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));
		Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado na conta:"));

		switch (escolha) {
			case 1:
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == numero){
						contaCorrente.depositar(valor);
						cc.set(i, contaCorrente);
					}

				}
				break;

			case 2:
				for (int j = 0; j < cp.size(); j++) {
					ContaPoupanca contaPoupanca = cp.get(j);
					if (contaPoupanca.getNumero() == numero){
						contaPoupanca.depositar(valor);
						cp.set(j, contaPoupanca);
					}
				}
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!",
						"Erro", JOptionPane.ERROR_MESSAGE);
				break;
		}
	}

	@Override
	public void transferir() {
		Integer tipoOrigem = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta Origem (1- Conta Corrente ou 2- Conta Poupança):"));
		Integer contaOrigem = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta de origem:"));
		Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser transferido:"));
		Integer tipoDestino = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta Destino (1- Conta Corrente ou 2- Conta Poupança):"));
		Integer contaDestino = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta de destino:"));

		if (tipoOrigem == 1) {
			for (int i = 0; i < cc.size(); i++) {
				ContaCorrente contaCorrente = cc.get(i);
				if (contaCorrente.getNumero() == contaOrigem){
					contaCorrente.sacar(valor);
					cc.set(i, contaCorrente);
				}
				System.out.println("Conta não encontrada!");
			}
			if (tipoDestino == 1) {
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == contaOrigem){
						contaCorrente.depositar(valor);
						cc.set(i, contaCorrente);
					}
					System.out.println("Conta não encontrada!");
				}
			}else {
				for (int j = 0; j < cp.size(); j++) {
					ContaPoupanca contaPoupanca = cp.get(j);
					if (contaPoupanca.getNumero() == contaOrigem){
						contaPoupanca.depositar(valor);
						cp.set(j, contaPoupanca);
					}
				}
			}

		}else if (tipoOrigem == 2) {
			for (int i = 0; i < cp.size(); i++) {
				ContaPoupanca contaPoupanca = cp.get(i);
				if (contaPoupanca.getNumero() == contaOrigem) {
					contaPoupanca.sacar(valor);
					cp.set(i, contaPoupanca);
				}
				System.out.println("Conta não encontrada!");
			}
			if (tipoDestino == 2) {
				for (int i = 0; i < cp.size(); i++) {
					ContaPoupanca contaPoupanca = cp.get(i);
					if (contaPoupanca.getNumero() == contaOrigem) {
						contaPoupanca.depositar(valor);
						cp.set(i, contaPoupanca);
					}
					System.out.println("Conta não encontrada!");
				}
			} else {
				for (int i = 0; i < cc.size(); i++) {
					ContaCorrente contaCorrente = cc.get(i);
					if (contaCorrente.getNumero() == contaOrigem){
						contaCorrente.depositar(valor);
						cc.set(i, contaCorrente);
					}
					System.out.println("Conta não encontrada!");
				}
			}

		}else{
			JOptionPane.showMessageDialog(null, "Opção invalida!",
					"Erro", JOptionPane.ERROR_MESSAGE);
		}





	}

	private ContaCorrente criaOuAtualizaContaCC(String status) {
		int num = 1;
		int agencia = 1;
		String titular = null;
		double saldo = 0;

		JTextField titularField = new JTextField();
		JTextField saldoField = new JTextField();


		Object[] fields = {
				"Titular: ", titularField,
				"Saldo: ", saldoField,
		};

		JOptionPane.showConfirmDialog(null, fields, status + "A CONTA ", JOptionPane.OK_CANCEL_OPTION);

		try {
			titular = titularField.getText();
			String saldoStr = saldoField.getText();
			if(saldoStr.isEmpty()){
				saldo = 0;
			}else {
				saldo = Double.parseDouble(saldoStr);
			}
			ContaCorrente novaCC = new CCBuilder()
					.numero(num++)
					.agencia(agencia++)
					.tipo(1)
					.titular(titular)
					.saldo(saldo)
					.limite(1000)
					.criarContaCorrente();

			return novaCC;
		} catch (NumberFormatException e) {
			System.err.println("Erro ao converter valores. Certifique-se de preencher os campos corretamente.");
			return null;
		}catch (Exception e) {
			System.err.println("Erro ao criar objeto");
			return null;
		}
	}

	private ContaPoupanca criaOuAtualizaContaCP(String status) {
		int num = 001;
		int agencia = 1001;
		String titular = null;
		float saldo = 0;
		int aniversario = 0;

		JTextField titularField = new JTextField();
		JTextField saldoField = new JTextField();
		JTextField aniversarioField = new JTextField();


		Object[] fields = {
				"Titular: ", titularField,
				"Saldo: ", saldoField,
				"Aniversario: ", aniversarioField,
		};

		JOptionPane.showConfirmDialog(null, fields, status + "A CONTA ", JOptionPane.OK_CANCEL_OPTION);

		try {

			titular = titularField.getText();
			String saldoStr = saldoField.getText();
			if(saldoStr.isEmpty()){
				saldo = 0;
			}else {
				saldo = Float.parseFloat(saldoStr);
			}
			aniversario = Integer.parseInt(aniversarioField.getText());

			ContaPoupanca novaCP = new CPBuilder()
					.numero(num++)
					.agencia(agencia++)
					.tipo(2)
					.titular(titular)
					.saldo(saldo)
					.aniversario(aniversario)
					.criarContaPoupanca();

			return novaCP;

		} catch (Exception e) {
			System.err.println("Erro ao criar objeto");
			return null;
		}
	}
}

