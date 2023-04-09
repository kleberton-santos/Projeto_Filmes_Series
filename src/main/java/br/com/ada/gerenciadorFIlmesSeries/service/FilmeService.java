package br.com.ada.gerenciadorFIlmesSeries.service;

//import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Filme;

import java.util.List;

public interface FilmeService {
    List<Filme> list();
    Filme save(Filme filme);
    Filme findById(Long id);
    Filme update(Long id, Filme filme);
    void delete(Long id);
}
