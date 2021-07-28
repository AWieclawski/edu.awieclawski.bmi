package edu.awieclawski.bmi.prsn;

import java.math.BigDecimal;

import edu.awieclawski.bmi.base.Human;
import edu.awieclawski.bmi.tbl.I_Man;

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

	public String getCommentBMI() {
		return buildCommentBMI(I_Man.getBMImap());
	}

	@Override
	public String toString() {
		return "Man [age=" + getAge() + ", weight=" + getWeight() + ", height=" + getHeight() + "]";
	}

}
