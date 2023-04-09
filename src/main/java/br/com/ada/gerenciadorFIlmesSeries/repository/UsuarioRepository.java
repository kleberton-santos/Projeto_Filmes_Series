package br.com.ada.gerenciadorFIlmesSeries.repository;

import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
