package com.ifrn.edu.br.biblioteca.repository;

import com.ifrn.edu.br.biblioteca.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Query("SELECT c.nome, COUNT(l) as quantidade FROM Categoria c LEFT JOIN c.livros l GROUP BY c.nome ORDER BY quantidade DESC")
    List<Object[]> countLivrosPorCategoria();
}

