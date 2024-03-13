package br.com.generation.repository;

import br.com.generation.model.Conta;

public interface ContaRepository {

    // CRUD da Conta
    public abstract void procurarPorNumero(int numero);
    public void listarTodas();
    public void cadastrar();
    public void atualizar();
    public void deletar(int numero);

    // Métodos Bancários
    public void sacar(int numero, float valor);
    public void depositar(int numero, float valor);
    public void transferir(int numeroOrigem, int numeroDestino, float valor);

}
