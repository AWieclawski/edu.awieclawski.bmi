package edu.awieclawski.bmi.mdl;

import java.math.BigDecimal;

import edu.awieclawski.bmi.base.Comments;
import edu.awieclawski.bmi.base.Human;
import edu.awieclawski.bmi.exc.NotInRangeException;
import edu.awieclawski.bmi.sex.I_Man;
import edu.awieclawski.bmi.srvc.Calculator;
import edu.awieclawski.bmi.srvc.Selector;

/**
 * Man class containing methods that return the results of enumerations from
 * utility classes regarding Male
 * 
 * @author AWieclawski
 *
 */
public class Man extends Human implements I_Man {

	public Man(BigDecimal age, BigDecimal weight, BigDecimal height) {
		super(age, weight, height);
	}

	public Man() {
		super();
	}

	@Override
	public String commentBMI() {
		String result = Comments.ERROR.getDescription();
		int tire = -1;
		boolean check = true;
		try {
			tire = new Calculator().getBMITire(I_Man.getBMImap(), getBMI(), getAge());
		} catch (NotInRangeException e) {
			check = displayErrorMsgsIfBMINotInRange();
		}
		if (tire > 0 && check)
			result = new Selector().buildComment(tire);

		return result;
	}

	@Override
	public String toString() {
		return "Man [age=" + DEC_FORMAT.format(getAge()) + ", weight=" + DEC_FORMAT.format(getWeight()) + ", height="
				+ DEC_FORMAT.format(getHeight()) + "]";
	}

}
