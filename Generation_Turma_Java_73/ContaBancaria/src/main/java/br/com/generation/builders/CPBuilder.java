package br.com.generation.builders;

import br.com.generation.model.ContaCorrente;
import br.com.generation.model.ContaPoupanca;

public class CPBuilder {

    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;
    private int aniversario;

    //SETTERS

    public CPBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public CPBuilder agencia(int agencia) {
        this.agencia = agencia;
        return this;
    }

    public CPBuilder tipo(int tipo) {
        this.tipo = tipo;
        return this;
    }

    public CPBuilder titular(String titular) {
        this.titular = titular;
        return this;
    }

    public CPBuilder saldo(float saldo) {
        this.saldo = saldo;
        return this;
    }

    public CPBuilder aniversario(int aniversario) {
        this.aniversario = aniversario;
        return this;
    }

    public ContaPoupanca criarContaPoupanca(){
        return new ContaPoupanca(numero,agencia, tipo, titular, saldo, aniversario);
    }
}
