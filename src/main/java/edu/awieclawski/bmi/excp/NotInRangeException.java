package edu.awieclawski.bmi.excp;

public class NotInRangeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 231244546350237734L;
	private String messageTxt = "The value is out of range! ";

	@Override
	public String getMessage() {
		return messageTxt;
	}
}
