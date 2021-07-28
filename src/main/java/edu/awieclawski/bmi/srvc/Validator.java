package edu.awieclawski.bmi.srvc;

import java.math.BigDecimal;

import edu.awieclawski.bmi.excp.NotInRangeException;
import edu.awieclawski.bmi.excp.NotPositiveException;

/**
 * Simple comparison methods returning boolean
 * 
 * @author AWieclawski
 *
 */
public class Validator {

	public static boolean biggerThanZero(BigDecimal number) throws NotPositiveException {
		if (number.compareTo(BigDecimal.ZERO) <= 0)
			throw new NotPositiveException();
		
		return true;
	}

	public static boolean isInRange(BigDecimal number, BigDecimal min, BigDecimal max) throws NotInRangeException {
//		System.out.println("number=" + number + ", min=" + min + ", max=" + max);
		if (number.compareTo(min) >= 0 && number.compareTo(max) < 0)
			
			return true;
		throw new NotInRangeException();
	}
	
}
