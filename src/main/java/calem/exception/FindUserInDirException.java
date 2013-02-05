/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calem.exception;

/**
 * Exceção lançada quando não é possível obter os dados do usuário no diretório
 * @author Wilson
 */
public class FindUserInDirException extends RuntimeException {

    public FindUserInDirException(Throwable cause) {
        super(cause);
    }

    public FindUserInDirException(String message, Throwable cause) {
        super(message, cause);
    }

    public FindUserInDirException(String message) {
        super(message);
    }

    public FindUserInDirException() {
    }
}
