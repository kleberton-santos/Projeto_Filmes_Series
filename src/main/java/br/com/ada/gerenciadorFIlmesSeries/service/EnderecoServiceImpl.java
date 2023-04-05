package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService{
    private List<Endereco> enderecos = new ArrayList<>();

    public List<Endereco> list(){
        return enderecos;
    }

    @Override
    public Endereco save(Endereco endereco) {
        endereco.setId(enderecos.size() + 1L);
        enderecos.add(endereco);
        return endereco;
    }

    @Override
    public Endereco findById(Long id) {
        return enderecos.stream().filter(endereco -> endereco.getId() == id).findFirst().get();
    }

    @Override
    public Endereco update(Long id, Endereco endereco) {
        endereco.setId(id);
        int index = enderecos.indexOf(endereco);
        enderecos.set(index, endereco);
        return endereco;
    }

    @Override
    public void delete(Long id) {
        Endereco endereco = Endereco.builder().id(id).build();
        enderecos.remove(endereco);
    }
}
