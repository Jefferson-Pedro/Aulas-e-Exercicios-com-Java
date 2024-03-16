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
	public void procurarPorNumero(int numero) {

	}

	@Override
	public void listarTodas() {
		//System.out.println(cc.stream().forEach(););
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
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta ser alterado:"));
		Optional<ContaCorrente> ccEncontrada = cc.stream()
				.filter(c -> c.getNumero() == numero)
				.findFirst();

		if (ccEncontrada.isPresent()) {
			ContaCorrente contaCorrente = ccEncontrada.get();

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
		JTextField limiteField = new JTextField();

		Object[] fields = {
				"Titular: ", titularField,
				"Saldo: ", saldoField,
				"Limite: ", limiteField
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
			aniversario = Integer.parseInt(limiteField.getText());

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

