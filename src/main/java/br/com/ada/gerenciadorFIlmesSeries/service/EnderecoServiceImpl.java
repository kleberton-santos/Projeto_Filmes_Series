package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.exception.EnderecoNotFoundException;
import br.com.ada.gerenciadorFIlmesSeries.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl implements EnderecoService{

    private final EnderecoRepository repository;
   // private List<Endereco> enderecos = new ArrayList<>();

    public List<Endereco> list(){
        return (List<Endereco>) repository.findAll();
    }

    @Override
    public Endereco save(Endereco endereco) {
        return repository.save(endereco);
    }

    @Override
    public Endereco findById(Long id) {
        return repository.findById(id).orElseThrow(EnderecoNotFoundException::new);
    }

    @Override
    public Endereco update(Long id, Endereco endereco) {
       if (repository.existsById(id)){
           endereco.setId(id);
           return repository.save(endereco);
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
