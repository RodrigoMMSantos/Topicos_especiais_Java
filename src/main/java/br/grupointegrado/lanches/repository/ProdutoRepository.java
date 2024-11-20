package br.grupointegrado.lanches.repository;

import br.grupointegrado.lanches.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
