/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author vinicius
 */
public class ValorNaoInformadoException extends Exception{
    private final String exceptionMessage;
    
    public ValorNaoInformadoException() {
        exceptionMessage = "O valor da despesa não foi informado.";
    }

    @Override
    public String getMessage(){
        return exceptionMessage;
    }      
}
