package edu.awieclawski.mdl;

import edu.awieclawski.base.Comments;
import edu.awieclawski.base.Human;
import edu.awieclawski.exc.NotInRangeException;
import edu.awieclawski.sex.I_Man;
import edu.awieclawski.srvc.Calc;
import edu.awieclawski.srvc.Selector;
import edu.awieclawski.srvc.Validate;

public class Man extends Human implements I_Man {

	public Man(int age, double weight, double height) {
		super(age, weight, height);
	}

	@Override
	public String commentBMI() {
		String result = Comments.ERROR.getDescription();
		int tire = -1;
		try {
			tire = new Calc().getBMITire(I_Man.getBMImap(), getBMI(), getAge());
		} catch (NotInRangeException e) {
			displayErrorMsgs(e.getMessage());
		}
		if (tire > 0)
			result = new Selector().buildComment(tire);

		return result;
	}

	private void displayErrorMsgs(String msg) {
		if (!Validate.isInRange(getAge(), MIN_AGE, MAX_AGE))
			System.out.println(msg + "|Age=" + DEC_FORMAT.format(getAge()));

		if (!Validate.isInRange(this.getBMI(), MIN_BMI, MAX_BMI))
			System.out.println(msg + "|BMI=" + DEC_FORMAT.format(getBMI()));
	}

	@Override
	public String toString() {
		return "Man [age=" + getAge() + ", weight=" + getWeight() + ", height=" + getHeight() + "]";
	}

}
