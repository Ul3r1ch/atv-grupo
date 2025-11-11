package br.com.senai.infob.loja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.senai.infob.loja.models.Endereco;
import br.com.senai.infob.loja.repositories.EnderecoRepository;


@Service
public class EnderecoService {

    @Autowired
    public EnderecoRepository enderecoRepository;

    @GetMapping("/buscar/{id}")
        public Endereco buscar (@PathVariable Integer id) {
            return enderecoRepository.findById(id).get();
        }

    public Endereco salvar(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
}
