package br.com.ada.gerenciadorFIlmesSeries.controller;

import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import br.com.ada.gerenciadorFIlmesSeries.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("usuarios")
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> list(){
        return usuarioService.list();
    }

    @GetMapping({"id"})
    public Usuario getById(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
    @PutMapping("{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario aerogerador){
        return usuarioService.update(id, aerogerador);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
