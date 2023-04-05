package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;

import java.util.List;

public interface EnderecoService {
    List<Endereco> list();
    Endereco save(Endereco endereco);
    Endereco findById(Long id);
    Endereco update(Long id, Endereco endereco);
    void delete(Long id);
}
