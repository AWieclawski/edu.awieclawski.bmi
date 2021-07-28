package edu.awieclawski.bmi.excp;

public class NotPositiveException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9021244546350237746L;
	private String messageTxt = "The number entered must be greater than zero! ";

	@Override
	public String getMessage() {
		return messageTxt;
	}
}
