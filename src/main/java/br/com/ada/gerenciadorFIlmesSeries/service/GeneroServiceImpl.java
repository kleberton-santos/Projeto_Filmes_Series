package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Genero;
import br.com.ada.gerenciadorFIlmesSeries.exception.EnderecoNotFoundException;
import br.com.ada.gerenciadorFIlmesSeries.repository.EnderecoRepository;
import br.com.ada.gerenciadorFIlmesSeries.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GeneroServiceImpl implements GeneroService{
    private final GeneroRepository repository;
    // private List<Endereco> enderecos = new ArrayList<>();

    public List<Genero> list(){
        return (List<Genero>) repository.findAll();
    }

    @Override
    public Genero save(Genero genero) {
        return repository.save(genero);
    }

    @Override
    public Genero findById(Long id) {
        return repository.findById(id).orElseThrow(EnderecoNotFoundException::new);
    }

    @Override
    public Genero update(Long id, Genero genero) {
        if (repository.existsById(id)){
            genero.setId(id);
            return repository.save(genero);
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
