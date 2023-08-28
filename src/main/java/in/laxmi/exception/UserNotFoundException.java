package in.laxmi.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6308299624384169438L;

	public UserNotFoundException() {

	}

	public UserNotFoundException(String msg) {
		super(msg);
	}
}
