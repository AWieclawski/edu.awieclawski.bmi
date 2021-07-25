package edu.awieclawski.srvc;

import edu.awieclawski.exc.NotPositiveException;

public class Validate {

	public static boolean biggerThanZero(double number) throws NotPositiveException {
		if (number <= 0)
			throw new NotPositiveException();
		return true;
	}

	public static boolean isInRange(double number, double min, double max) {
		if (number >= min && number <= max)
			return true;
		else
			return false;
	}

}
