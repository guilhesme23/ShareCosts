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
public class CategoriaNaoInformadaException extends Exception{
    private final String exceptionMessage;
    
    public CategoriaNaoInformadaException() {
        exceptionMessage = "A categoria da despesa não foi informada";
    }

    public String getExceptionMessage(){
        return exceptionMessage;
    }  
    
    
    
}
