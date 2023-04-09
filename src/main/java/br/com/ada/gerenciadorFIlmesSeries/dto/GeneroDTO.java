package br.com.ada.gerenciadorFIlmesSeries.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GeneroDTO {
    @NotBlank(message = "Nome é um campo obrigatorio")
    private String nome;

}
