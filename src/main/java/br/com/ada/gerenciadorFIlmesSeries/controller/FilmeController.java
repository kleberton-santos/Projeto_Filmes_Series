package br.com.ada.gerenciadorFIlmesSeries.controller;


//import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Filme;
import br.com.ada.gerenciadorFIlmesSeries.domain.Genero;
import br.com.ada.gerenciadorFIlmesSeries.dto.EnderecoSaveDTO;
import br.com.ada.gerenciadorFIlmesSeries.dto.FilmeDTO;
import br.com.ada.gerenciadorFIlmesSeries.service.EnderecoService;
import br.com.ada.gerenciadorFIlmesSeries.service.FilmeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("filmes")
@RestController
public class FilmeController {
    private final FilmeService filmeService;

    @GetMapping
    public List<Filme> list(){
        return filmeService.list();
    }

    @GetMapping({"id"})
    public Filme getById(@PathVariable Long id){
        return filmeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Filme save(@Valid @RequestBody FilmeDTO dto){
        Filme filme = Filme.builder()
                .nome(dto.getNome())
                .ano(dto.getAno())
                .genero(dto.getGenero())
                .genero(Genero.builder().id(dto.getGeneroId()).build())
                .build();
        return filmeService.save(filme);
    }
    @PutMapping("{id}")
    public Filme update(@PathVariable Long id, @RequestBody FilmeDTO dto){
        Filme filme = Filme.builder()
                .nome(dto.getNome())
                .ano(dto.getAno())
                .genero(dto.getGenero())
                .build();
        return filmeService.update(id, filme);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        filmeService.delete(id);
    }
}
