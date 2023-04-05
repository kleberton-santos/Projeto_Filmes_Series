package br.com.ada.gerenciadorFIlmesSeries.service;

import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> list(){
        return usuarios;
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuario.setId(usuarios.size() + 1L);
        usuarios.add(usuario);
        return usuario;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst().get();
    }

    @Override
    public Usuario update(Long id, Usuario usuario) {
        usuario.setId(id);
        int index = usuarios.indexOf(usuario);
        usuarios.set(index, usuario);
        return usuario;
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = Usuario.builder().id(id).build();
        usuarios.remove(usuario);
    }
}
