package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.ListaFilmes;
import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import br.com.ada.gerenciadorFIlmesSeries.exception.UsuarioNotFoundException;
import br.com.ada.gerenciadorFIlmesSeries.repository.ListaFilmeRepository;
import br.com.ada.gerenciadorFIlmesSeries.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaFilmeServiceImpl implements ListaFilmeService{
    private final ListaFilmeRepository repository;

    public ListaFilmeServiceImpl(ListaFilmeRepository repository) {
        this.repository = repository;
    }
    // private List<Endereco> enderecos = new ArrayList<>();

    public List<ListaFilmes> list(){
        return (List<ListaFilmes>) repository.findAll();
    }

    @Override
    public ListaFilmes save(ListaFilmes listaFilmes) {
        return repository.save(listaFilmes);
    }

    @Override
    public ListaFilmes findById(Long id) {
        return repository.findById(id).orElseThrow(UsuarioNotFoundException::new);
    }

    @Override
    public ListaFilmes update(Long id, ListaFilmes listaFilmes) {
        if (repository.existsById(id)){
            listaFilmes.setId(id);
            return repository.save(listaFilmes);
        }
        throw new UsuarioNotFoundException();
    }

    @Override
    public void delete(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return;
        }
        throw new UsuarioNotFoundException();
    }
}
