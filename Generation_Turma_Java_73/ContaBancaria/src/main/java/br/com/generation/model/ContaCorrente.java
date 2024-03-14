package br.com.generation.model;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, double saldo, float limite){
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	@Override
	public Boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			 JOptionPane.showMessageDialog(null,"Saldo Insuficiente","Erro", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		JOptionPane.showMessageDialog(null, "Novo Saldo: " + this.getSaldo());
		return true;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		JOptionPane.showMessageDialog(null, "Limite de Crédito: " + this.limite);
	}
	
	//GET e SET

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
}
