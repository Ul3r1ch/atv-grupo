package br.com.senai.infob.loja.models;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nome_completo")
    private String nome_Completo;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="data_Nascimento")
    private LocalDateTime data_Nascimento;

    @Column(name="CPF")
    private String CPF;

    public Usuario() {
    }

    public Usuario(Integer id, String nome_Completo, String email, String senha, LocalDateTime data_Nascimento,
            String cPF) {
        this.id = id;
        this.nome_Completo = nome_Completo;
        this.email = email;
        this.senha = senha;
        this.data_Nascimento = data_Nascimento;
        CPF = cPF;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_Completo() {
        return nome_Completo;
    }

    public void setNome_Completo(String nome_Completo) {
        this.nome_Completo = nome_Completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(LocalDateTime data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    
}
