package com.ifrn.edu.br.biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoEfetiva;

    @Enumerated(EnumType.STRING)
    private StatusEmprestimo status;

    private double valorMulta;

    @ManyToMany
    @JoinTable(
            name = "item_emprestimo",
            joinColumns = @JoinColumn(name = "emprestimo_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private List<Livro> livros;

    public enum StatusEmprestimo {
        ATIVO, DEVOLVIDO, ATRASADO
    }
}
