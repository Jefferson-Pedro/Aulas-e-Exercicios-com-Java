package br.com.generation.builders;

import br.com.generation.model.ContaCorrente;

public class CCBuilder {

    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;
    private float limite;

    //SETTERS

    public CCBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public CCBuilder agencia(int agencia) {
        this.agencia = agencia;
        return this;
    }

    public CCBuilder tipo(int tipo) {
        this.tipo = tipo;
        return this;
    }

    public CCBuilder titular(String titular) {
        this.titular = titular;
        return this;
    }

    public CCBuilder saldo(float saldo) {
        this.saldo = saldo;
        return this;
    }

    public CCBuilder limite(float limite) {
        this.limite = limite;
        return this;
    }

    public ContaCorrente criarContaCorrente(){
       return new ContaCorrente(numero,agencia, tipo, titular, saldo, limite);
    }
}
