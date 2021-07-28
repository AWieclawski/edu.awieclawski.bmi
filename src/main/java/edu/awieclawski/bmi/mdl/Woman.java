package edu.awieclawski.bmi.mdl;

import java.math.BigDecimal;

import edu.awieclawski.bmi.base.Comments;
import edu.awieclawski.bmi.base.Human;
import edu.awieclawski.bmi.exc.NotInRangeException;
import edu.awieclawski.bmi.sex.I_Woman;
import edu.awieclawski.bmi.srvc.Calculator;
import edu.awieclawski.bmi.srvc.Selector;

/**
 * Woman class containing methods that return the results of enumerations from
 * utility classes regarding Female
 * 
 * @author AWieclawski
 *
 */
public class Woman extends Human implements I_Woman {

	public Woman(BigDecimal age, BigDecimal weight, BigDecimal height) {
		super(age, weight, height);
	}

	public Woman() {
		super();
	}

	@Override
	public String commentBMI() {
		String result = Comments.ERROR.getDescription();
		int tire = -1;
		boolean check = true;
		try {
			tire = new Calculator().getBMITire(I_Woman.getBMImap(), getBMI(), getAge());
		} catch (NotInRangeException e) {
			check = displayErrorMsgsIfBMINotInRange();
		}
		if (tire > 0 && check)
			result = new Selector().buildComment(tire);

		return result;
	}

	@Override
	public String toString() {
		return "Woman [age=" + DEC_FORMAT.format(getAge()) + ", weight=" + DEC_FORMAT.format(getWeight()) + ", height="
				+ DEC_FORMAT.format(getHeight()) + "]";
	}

}
