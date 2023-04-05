package br.com.ada.gerenciadorFIlmesSeries.controller;


import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Usuario;
import br.com.ada.gerenciadorFIlmesSeries.dto.EnderecoSaveDTO;
import br.com.ada.gerenciadorFIlmesSeries.service.EnderecoService;
import br.com.ada.gerenciadorFIlmesSeries.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("enderecos")
@RestController
public class EnderecoController {

    private final EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> list(){
        return enderecoService.list();
    }

    @GetMapping({"id"})
    public Endereco getById(@PathVariable Long id){
        return enderecoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco save(@Valid @RequestBody EnderecoSaveDTO dto){
        Endereco endereco = Endereco.builder()
                .cep(dto.getCep())
                .logradouro(dto.getLogradouro())
                .numero(dto.getNumero())
                .build();
        return enderecoService.save(endereco);
    }
    @PutMapping("{id}")
    public Endereco update(@PathVariable Long id, @RequestBody EnderecoSaveDTO dto){
        Endereco endereco = Endereco.builder()
                .cep(dto.getCep())
                .logradouro(dto.getLogradouro())
                .numero(dto.getNumero())
                .build();
        return enderecoService.update(id, endereco);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        enderecoService.delete(id);
    }
}
