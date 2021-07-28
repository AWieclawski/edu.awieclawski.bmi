package edu.awieclawski.bmi.prsn;

import java.math.BigDecimal;

import edu.awieclawski.bmi.base.Human;
import edu.awieclawski.bmi.tbl.I_Woman;

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

	public String getCommentBMI() {
		return buildCommentBMI(I_Woman.getBMImap());
	}

	@Override
	public String toString() {
		return "Woman [age=" + getAge() + ", weight=" + getWeight() + ", height=" + getHeight() + "]";
	}

}
