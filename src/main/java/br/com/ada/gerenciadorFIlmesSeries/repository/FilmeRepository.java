package br.com.ada.gerenciadorFIlmesSeries.repository;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Long> {
}
