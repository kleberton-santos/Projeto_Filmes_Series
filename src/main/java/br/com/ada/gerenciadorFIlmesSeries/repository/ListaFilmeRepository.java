package br.com.ada.gerenciadorFIlmesSeries.repository;

import br.com.ada.gerenciadorFIlmesSeries.domain.ListaFilmes;
import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface ListaFilmeRepository extends CrudRepository<ListaFilmes, Long> {
}
