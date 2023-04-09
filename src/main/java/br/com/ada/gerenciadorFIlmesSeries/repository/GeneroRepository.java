package br.com.ada.gerenciadorFIlmesSeries.repository;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Genero;
import org.springframework.data.repository.CrudRepository;

public interface GeneroRepository extends CrudRepository<Genero, Long> {
}
