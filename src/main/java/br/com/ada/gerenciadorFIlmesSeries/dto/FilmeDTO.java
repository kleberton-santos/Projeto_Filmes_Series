package br.com.ada.gerenciadorFIlmesSeries.dto;

import br.com.ada.gerenciadorFIlmesSeries.domain.Endereco;
import br.com.ada.gerenciadorFIlmesSeries.domain.Genero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Setter
@Getter
@NoArgsConstructor
public class FilmeDTO {
    @NotBlank(message = "Filme é um campo obrigatorio")
    private String nome;
    @CPF
    private String ano;
    @NotNull
    private Genero genero;

    private Long generoId;
}
