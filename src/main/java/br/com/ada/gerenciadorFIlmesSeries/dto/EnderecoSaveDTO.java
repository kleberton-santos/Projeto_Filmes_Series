package br.com.ada.gerenciadorFIlmesSeries.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class EnderecoSaveDTO {

    @NotBlank(message = "CEP é um campo obrigatorio")
    @JsonProperty("code")
    private String cep;
    @NotBlank
    private String logradouro;
    @NotNull
    private String numero;
}
