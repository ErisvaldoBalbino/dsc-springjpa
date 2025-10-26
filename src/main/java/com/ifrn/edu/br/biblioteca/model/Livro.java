package com.ifrn.edu.br.biblioteca.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long isbn;
    private String titulo;
    private String editora;
    private int anoPublicacao;
    private int numeroPaginas;
    private int quantidadeTotal;
    private int quantidadeDisponivel;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToMany(mappedBy = "livros")
    private List<Autor> autores;

    @ManyToMany(mappedBy = "livros")
    private List<Emprestimo> emprestimos;
    
}
