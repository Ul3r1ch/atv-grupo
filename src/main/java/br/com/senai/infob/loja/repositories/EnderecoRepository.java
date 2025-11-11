package br.com.senai.infob.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.infob.loja.models.Endereco;
@Repository

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
}
