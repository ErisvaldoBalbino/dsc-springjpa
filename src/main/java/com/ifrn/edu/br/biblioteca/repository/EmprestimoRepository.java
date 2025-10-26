package com.ifrn.edu.br.biblioteca.repository;

import com.ifrn.edu.br.biblioteca.model.Emprestimo;
import com.ifrn.edu.br.biblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    List<Emprestimo> findByUsuarioAndStatus(Usuario usuario, Emprestimo.StatusEmprestimo status);
    
    List<Emprestimo> findByDataDevolucaoPrevistaBeforeAndStatus(LocalDate dataAtual, Emprestimo.StatusEmprestimo status);
}

