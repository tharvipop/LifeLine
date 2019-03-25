/**
 * 
 */
package exceptions;

import java.io.IOException;

/**
 * @author atharvakulkarni
 *
 */
public class BadDataException extends IOException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BadDataException(String message) {
		super(message);
	}
	
	public BadDataException() {
		super();
	}

}
