package br.com.ada.gerenciadorFIlmesSeries.exception;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(){
        super("Usuario não encontrado");
    }
}
