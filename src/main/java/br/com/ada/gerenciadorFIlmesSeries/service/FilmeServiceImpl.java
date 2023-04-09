package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Filme;
import br.com.ada.gerenciadorFIlmesSeries.exception.EnderecoNotFoundException;
import br.com.ada.gerenciadorFIlmesSeries.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmeServiceImpl implements FilmeService{
    private final FilmeRepository repository;

    public List<Filme> list(){
        return (List<Filme>) repository.findAll();
    }

    @Override
    public Filme save(Filme filme) {
        return repository.save(filme);
    }

    @Override
    public Filme findById(Long id) {
        return repository.findById(id).orElseThrow(EnderecoNotFoundException::new);
    }

    @Override
    public Filme update(Long id, Filme filme) {
        if (repository.existsById(id)){
            filme.setId(id);
            return repository.save(filme);
        }
        throw new EnderecoNotFoundException();
    }

    @Override
    public void delete(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return;
        }
        throw new EnderecoNotFoundException();
    }

}
