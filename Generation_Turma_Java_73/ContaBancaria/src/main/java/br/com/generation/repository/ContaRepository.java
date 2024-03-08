package br.com.generation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.model.Conta;

public interface ContaRepository extends JpaRepository<Integer, Conta>{

}
