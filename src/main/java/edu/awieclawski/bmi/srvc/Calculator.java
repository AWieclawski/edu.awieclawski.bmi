package edu.awieclawski.bmi.srvc;

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

	public int getBMITire(Map<double[], double[][]> map, double bmi, int age) throws NotInRangeException {
		int result = 1;
		boolean check = false;
		boolean found = false;

		if (bmi == 0)
			return -1;

		try {
			check = Validator.biggerThanZero(age);
		} catch (NotPositiveException e) {
			System.out.println(e.getMessage() + "|Age=" + age);
			return -1;
		}

		if (check) {

			for (Map.Entry<double[], double[][]> entry : map.entrySet())
				if (entry.getKey()[0] <= age && entry.getKey()[1] > age)
					for (double[] tmp : entry.getValue())
						if (tmp[0] <= bmi && tmp[1] > bmi) {
							found = true;
							break;
						} else
							result++;

		}
		if (found)
			return result;
		else {
			throw new NotInRangeException();
		}
	}

}
