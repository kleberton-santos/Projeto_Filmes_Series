package br.com.ada.gerenciadorFIlmesSeries.exception;

public class EnderecoNotFoundException extends RuntimeException {
    public EnderecoNotFoundException(){
        super("Endereço não encontrado");
    }

}
