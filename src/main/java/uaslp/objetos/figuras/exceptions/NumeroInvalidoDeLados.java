package uaslp.objetos.figuras.exceptions;

import java.security.PublicKey;

public class NumeroInvalidoDeLados extends RuntimeException{
    private String message;

    public NumeroInvalidoDeLados(String message){
        super(message);
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public NumeroInvalidoDeLados(){

    }
}
