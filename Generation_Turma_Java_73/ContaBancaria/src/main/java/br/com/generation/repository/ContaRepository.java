package br.com.generation.repository;

import br.com.generation.model.Conta;

public interface ContaRepository {

    // CRUD da Conta
    public abstract void procurarPorNumero();
    public void listarTodas();
    public void cadastrar();
    public void atualizar();
    public void deletar();

    // Métodos Bancários
    public void sacar();
    public void depositar();
    public void transferir();

}
