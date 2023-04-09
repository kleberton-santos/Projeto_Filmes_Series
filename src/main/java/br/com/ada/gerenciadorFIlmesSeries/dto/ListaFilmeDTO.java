package br.com.ada.gerenciadorFIlmesSeries.dto;

import br.com.ada.gerenciadorFIlmesSeries.domain.ListaFilmes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ListaFilmeDTO {

    private String usuario;
    private String nome;
    private ListaFilmes lista;
}
