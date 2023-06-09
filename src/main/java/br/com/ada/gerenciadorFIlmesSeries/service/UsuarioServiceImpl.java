package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import br.com.ada.gerenciadorFIlmesSeries.exception.UsuarioNotFoundException;
import br.com.ada.gerenciadorFIlmesSeries.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
   // private List<Usuario> usuarios = new ArrayList<>();
   private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }
    // private List<Endereco> enderecos = new ArrayList<>();

    public List<Usuario> list(){
        return (List<Usuario>) repository.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return repository.findById(id).orElseThrow(UsuarioNotFoundException::new);
    }

    @Override
    public Usuario update(Long id, Usuario usuario) {
        if (repository.existsById(id)){
            usuario.setId(id);
            return repository.save(usuario);
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
