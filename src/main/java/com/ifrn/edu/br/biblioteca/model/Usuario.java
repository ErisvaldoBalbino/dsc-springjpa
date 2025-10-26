package com.ifrn.edu.br.biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private int telefone;
    private LocalDate dataCadastro;
    private String endereco;
    private boolean ativo;

    @OneToMany(mappedBy = "usuario")
    private List<Emprestimo> emprestimos;
}
