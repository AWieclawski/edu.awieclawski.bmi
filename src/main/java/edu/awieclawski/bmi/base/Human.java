package edu.awieclawski.bmi.base;

import java.math.BigDecimal;
//import java.math.MathContext;
import java.math.RoundingMode;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import edu.awieclawski.bmi.exc.NotInRangeException;
import edu.awieclawski.bmi.exc.NotPositiveException;
import edu.awieclawski.bmi.srvc.Validator;

public abstract class Human implements I_Human, I_UOMs {
	private final BigDecimal zero = BigDecimal.ZERO;

	@NotNull(message = AGE_NOTNULL)
	@DecimalMin(value = AGE_MINSTR, message = AGE_MINTXT)
	@DecimalMax(value = AGE_MAXSTR, message = AGE_MAXTXT)
	private BigDecimal age;

	@NotNull(message = WGHT_NOTNULL)
	@DecimalMax(value = WGHT_MAXSTR, message = WGHT_MAXTXT)
	private BigDecimal weight;

	@NotNull(message = HGHT_NOTNULL)
	@DecimalMax(value = HGHT_MAXSTR, message = HGHT_MAXTXT)
	private BigDecimal height;

	public Human(BigDecimal age, BigDecimal weight, BigDecimal height) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public Human() {
		super();
	}

	public abstract String commentBMI();

	protected BigDecimal getBMI() {
		if (this.weight.compareTo(zero) > 0 && this.height.compareTo(zero) > 0) {
			if (displayErrorMsgsIfNotInRange())
				return this.weight.divide(this.height.multiply(this.height), DEC_COMMA, RoundingMode.HALF_UP);
		}
		displayErrorMsgsIfNotBiggerThanZero();
		return zero;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	private void displayErrorMsgsIfNotBiggerThanZero() {
		try {
			Validator.biggerThanZero(this.weight);
		} catch (NotPositiveException e) {
			System.out.println(e.getMessage() + "|Weight=" + this.weight);
		}

		try {
			Validator.biggerThanZero(this.height);
		} catch (NotPositiveException e) {
			System.out.println(e.getMessage() + "|Height=" + this.height);
		}
	}

	private boolean displayErrorMsgsIfNotInRange() {
		boolean result = true;
		try {
			Validator.isInRange(this.weight, WGHT_MIN, WGHT_MAX);
		} catch (NotInRangeException e) {
			result = false;
			System.out.println(e.getMessage() + "|Weight=" + DEC_FORMAT.format(getWeight()));
		}

		try {
			Validator.isInRange(this.height, HGHT_MIN, HGHT_MAX);
		} catch (NotInRangeException e) {
			result = false;
			System.out.println(e.getMessage() + "|Height=" + DEC_FORMAT.format(getHeight()));
		}

		return result;
	}

	public boolean displayErrorMsgsIfBMINotInRange() {
		boolean result = true;
		try {
			Validator.isInRange(this.age, AGE_MIN, AGE_MAX);
		} catch (NotInRangeException e) {
			result = false;
			System.out.println(e.getMessage() + "|Age=" + DEC_FORMAT.format(getAge()));
		}

		try {
			Validator.isInRange(this.getBMI(), MIN_BMI, MAX_BMI);
		} catch (NotInRangeException e) {
			result = false;
			System.out.println(e.getMessage() + "|BMI=" + DEC_FORMAT.format(getBMI()));
		}
		
		return result;
	}

}
