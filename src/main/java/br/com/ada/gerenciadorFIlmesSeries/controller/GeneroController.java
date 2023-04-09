package br.com.ada.gerenciadorFIlmesSeries.controller;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Genero;
import br.com.ada.gerenciadorFIlmesSeries.dto.EnderecoSaveDTO;
import br.com.ada.gerenciadorFIlmesSeries.dto.GeneroDTO;
import br.com.ada.gerenciadorFIlmesSeries.service.EnderecoService;
import br.com.ada.gerenciadorFIlmesSeries.service.GeneroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("generos")
@RestController
public class GeneroController {
    private final GeneroService generoService;

    @GetMapping
    public List<Genero> list(){
        return generoService.list();
    }

    @GetMapping({"id"})
    public Genero getById(@PathVariable Long id){
        return generoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Genero save(@Valid @RequestBody GeneroDTO dto){
        Genero genero = Genero.builder()
                .nome(dto.getNome())
                .build();
        return generoService.save(genero);
    }
    @PutMapping("{id}")
    public Genero update(@PathVariable Long id, @RequestBody GeneroDTO dto){
        Genero genero = Genero.builder()
                .nome(dto.getNome())
                .build();
        return generoService.update(id, genero);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        generoService.delete(id);
    }
}
