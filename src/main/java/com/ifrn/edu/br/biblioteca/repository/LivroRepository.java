package com.ifrn.edu.br.biblioteca.repository;

import com.ifrn.edu.br.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByQuantidadeDisponivelGreaterThanOrderByTituloAsc(int quantidade);
    
    List<Livro> findByCategoriaNome(String nomeCategoria);
    
    List<Livro> findByAutoresNomeOrderByAnoPublicacao(String nomeAutor);
}
