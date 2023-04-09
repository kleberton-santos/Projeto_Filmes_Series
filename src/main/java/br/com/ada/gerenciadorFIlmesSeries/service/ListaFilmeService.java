package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.ListaFilmes;
//import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;

import java.util.List;

public interface ListaFilmeService {
    List<ListaFilmes> list();
    ListaFilmes save(ListaFilmes listaFilmes);
    ListaFilmes findById(Long id);
    ListaFilmes update(Long id, ListaFilmes listaFilmes);
    void delete(Long id);
}
