/**
 * 
 */
package exceptions;

import java.util.InputMismatchException;

/**
 * @author atharvakulkarni
 *
 */
public class InvalidMoveException extends InputMismatchException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InvalidMoveException(String message) {
		super(message);
	}
	
	public InvalidMoveException() {
		super();
	}

}
