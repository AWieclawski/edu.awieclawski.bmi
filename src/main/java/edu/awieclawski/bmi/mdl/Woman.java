package edu.awieclawski.bmi.mdl;

import edu.awieclawski.bmi.base.Comments;
import edu.awieclawski.bmi.base.Human;
import edu.awieclawski.bmi.exc.NotInRangeException;
import edu.awieclawski.bmi.sex.I_Woman;
import edu.awieclawski.bmi.srvc.Calculator;
import edu.awieclawski.bmi.srvc.Selector;
import edu.awieclawski.bmi.srvc.Validator;

/**
 * Woman class containing methods that return the results of enumerations from
 * utility classes regarding Female
 * 
 * @author AWieclawski
 *
 */
public class Woman extends Human implements I_Woman {

	public Woman(int age, double weight, double height) {
		super(age, weight, height);
	}
	
	public Woman() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String commentBMI() {
		String result = Comments.ERROR.getDescription();
		int tire = -1;
		try {
			tire = new Calculator().getBMITire(I_Woman.getBMImap(), getBMI(), getAge());
		} catch (NotInRangeException e) {
			displayErrorMsgs(e.getMessage());
		}
		if (tire > 0)
			result = new Selector().buildComment(tire);

		return result;
	}

	private void displayErrorMsgs(String msg) {
		if (!Validator.isInRange(getAge(), AGE_MIN, AGE_MAX))
			System.out.println(msg + "|Age=" + DEC_FORMAT.format(getAge()));

		if (!Validator.isInRange(this.getBMI(), MIN_BMI, MAX_BMI))
			System.out.println(msg + "|BMI=" + DEC_FORMAT.format(getBMI()));
	}

	@Override
	public String toString() {
		return "Woman [age=" + getAge() + ", weight=" + getWeight() + ", height=" + getHeight() + "]";
	}

}
