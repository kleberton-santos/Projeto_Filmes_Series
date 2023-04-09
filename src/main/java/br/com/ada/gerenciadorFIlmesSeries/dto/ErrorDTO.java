package br.com.ada.gerenciadorFIlmesSeries.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ErrorDTO {
    private String message;
}
