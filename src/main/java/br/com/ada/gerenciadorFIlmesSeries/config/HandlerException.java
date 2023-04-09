package br.com.ada.gerenciadorFIlmesSeries.config;

import br.com.ada.gerenciadorFIlmesSeries.dto.ErrorDTO;
import br.com.ada.gerenciadorFIlmesSeries.exception.EnderecoNotFoundException;
import br.com.ada.gerenciadorFIlmesSeries.exception.UsuarioNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class HandlerException {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EnderecoNotFoundException.class)
    public ErrorDTO handlerEnderecoNotFound(EnderecoNotFoundException ex){
        return ErrorDTO.builder().message(ex.getMessage()).build();
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UsuarioNotFoundException.class)
    public ErrorDTO handlerUsuarioNotFound(UsuarioNotFoundException ex){
        return ErrorDTO.builder().message(ex.getMessage()).build();
    }

}
