package edu.awieclawski.bmi.base;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import edu.awieclawski.bmi.exc.NotPositiveException;
import edu.awieclawski.bmi.srvc.Validator;

public abstract class Human {
	private double zero = 0.0;
	public final static String WGHT_NOTNULL = "Weight cannot be null";
	public final static String HGHT_NOTNULL = "Height cannot be null";
	public final static String AGE_NOTNULL = "Age cannot be null";
	public final static int AGE_MIN = 18;
	public final static int AGE_MAX = 199;
	public final static String AGE_MINTXT = "Age should not be less than " + AGE_MIN;
	public final static String AGE_MAXTXT = "Age should not be greater than " + AGE_MAX;
	public final static int WGHT_MIN = 1;
	public final static int WGHT_MAX = 499;
	public final static String WGHT_MINTXT = "Weight should not be less than " + WGHT_MIN;
	public final static String WGHT_MAXTXT = "Weight should not be greater than " + WGHT_MAX;
	public final static int HGHT_MIN = 1;
	public final static int HGHT_MAX = 3;
	public final static String HGHT_MINTXT = "Height should not be less than " + HGHT_MIN;
	public final static String HGHT_MAXTXT = "Height should not be greater than " + HGHT_MAX;

	@NotNull(message = AGE_NOTNULL)
	@Min(value = AGE_MIN, message = AGE_MINTXT)
	@Max(value = AGE_MAX, message = AGE_MAXTXT)
	private int age;

	@NotNull(message = WGHT_NOTNULL)
	@Max(value = WGHT_MAX, message = WGHT_MAXTXT)
	private double weight;

	@NotNull(message = HGHT_NOTNULL)
	@Max(value = HGHT_MAX, message = HGHT_MAXTXT)
	private double height;

	// TODO replace double by BigDecimal to make validation more correct

	public Human(int age, double weight, double height) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public Human() {
		super();
	}

	public abstract String commentBMI();

	protected double getBMI() {
		if (this.weight > 0 && this.height > 0)
			return this.weight / (this.height * this.height);
		errorMsgs();
		return zero;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	private void errorMsgs() {
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

}
