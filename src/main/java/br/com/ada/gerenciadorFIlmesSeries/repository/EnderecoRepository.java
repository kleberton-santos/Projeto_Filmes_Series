package br.com.ada.gerenciadorFIlmesSeries.repository;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
