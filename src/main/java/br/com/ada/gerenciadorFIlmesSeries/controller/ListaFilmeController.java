package br.com.ada.gerenciadorFIlmesSeries.controller;

import br.com.ada.gerenciadorFIlmesSeries.domain.ListaFilmes;
//import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import br.com.ada.gerenciadorFIlmesSeries.dto.ListaFilmeDTO;
import br.com.ada.gerenciadorFIlmesSeries.dto.UsuarioSaveDTO;
import br.com.ada.gerenciadorFIlmesSeries.mapper.UsuarioMapper;
import br.com.ada.gerenciadorFIlmesSeries.service.FilmeService;
import br.com.ada.gerenciadorFIlmesSeries.service.ListaFilmeService;
import br.com.ada.gerenciadorFIlmesSeries.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("listafilmes")
@RestController
public class ListaFilmeController {
    private final ListaFilmeService listaFilmeService;

    @GetMapping
    public List<ListaFilmes> list(){
        return listaFilmeService.list();
    }

    @GetMapping({"id"})
    public ListaFilmes getById(@PathVariable Long id){
        return listaFilmeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ListaFilmes save(@RequestBody ListaFilmeDTO dto){
        ListaFilmes listaFilmes = ListaFilmes.builder()
                .usuario(dto.getUsuario())
                .nome(dto.getNome())
                .lista(dto.getLista())
                .build();
        return listaFilmeService.save(listaFilmes);
    }
    @PutMapping("{id}")
    public ListaFilmes update(@PathVariable Long id, @RequestBody ListaFilmeDTO dto){
        ListaFilmes listaFilmes = ListaFilmes.builder()
                .usuario(dto.getUsuario())
                .nome(dto.getNome())
                .lista(dto.getLista())
                .build();
        return listaFilmeService.save(listaFilmes);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        listaFilmeService.delete(id);
    }
}
