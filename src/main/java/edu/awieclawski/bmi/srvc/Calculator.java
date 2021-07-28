package edu.awieclawski.bmi.srvc;

import java.math.BigDecimal;
import java.util.Map;

import edu.awieclawski.bmi.exc.NotInRangeException;
import edu.awieclawski.bmi.exc.NotPositiveException;

/**
 * The class contains logic comparing the received data with the BMI tables
 * 
 * @author AWieclawski
 *
 */
public class Calculator {

	public int getBMITire(Map<BigDecimal[], BigDecimal[][]> map, BigDecimal bmi, BigDecimal age)
			throws NotInRangeException {
		int result = 1;
		boolean check = false;
		boolean found = false;

		if (bmi.compareTo(BigDecimal.ZERO) == 0)
			return -1;

		try {
			check = Validator.biggerThanZero(age);
		} catch (NotPositiveException e) {
			System.out.println(e.getMessage() + "|Age=" + age);
			return -1;
		}

		if (check) {

			for (Map.Entry<BigDecimal[], BigDecimal[][]> entry : map.entrySet()) {
				if (entry.getKey()[0].compareTo(age) <= 0 && entry.getKey()[1].compareTo(age) > 0)
					for (BigDecimal[] tmp : entry.getValue()) {
						if (tmp[0].compareTo(bmi) <= 0 && tmp[1].compareTo(bmi) > 0) {
							found = true;
							break;
						} else
							result++;
					}
			}
		}
//		System.out.println("found=" + found + ", count=" + result + ", check=" + check);
		if (found)
			return result;
		else {
			throw new NotInRangeException();
		}
	}

}
