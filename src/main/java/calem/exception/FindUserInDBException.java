/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calem.exception;

/**
 * Exceção lançada quando ocorre um erro na tentiva de recuperar os dado do
 * usuário no banco de dados.
 * @author Wilson
 */
public class FindUserInDBException extends RuntimeException {

    public FindUserInDBException(Throwable cause) {
        super(cause);
    }

    public FindUserInDBException(String message, Throwable cause) {
        super(message, cause);
    }

    public FindUserInDBException(String message) {
        super(message);
    }

    public FindUserInDBException() {
    }
}
