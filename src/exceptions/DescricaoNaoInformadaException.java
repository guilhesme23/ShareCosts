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
public class DescricaoNaoInformadaException extends Exception{
    private final String exceptionMessage;
    
    public DescricaoNaoInformadaException() {
        exceptionMessage = "A descrição da despesa não foi informada.";
    }

    @Override
    public String getMessage(){
        return exceptionMessage;
    }      
}
