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
public class DadosPessoaisIncompletosException extends Exception {
    private final String exceptionMessage;
    
    public DadosPessoaisIncompletosException() {
        exceptionMessage = "Os dados de usuário estão incorretos.";
    }

    public String getExceptionMessage(){
        return exceptionMessage;
    }    
    
}
