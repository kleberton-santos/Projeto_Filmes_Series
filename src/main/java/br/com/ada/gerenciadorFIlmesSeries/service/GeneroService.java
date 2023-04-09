package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Genero;

import java.util.List;

public interface GeneroService {
    List<Genero> list();
    Genero save(Genero genero);
    Genero findById(Long id);
    Genero update(Long id, Genero genero);
    void delete(Long id);
}
