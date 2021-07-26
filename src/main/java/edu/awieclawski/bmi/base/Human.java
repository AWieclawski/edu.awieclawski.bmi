package edu.awieclawski.bmi.base;

//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;

import edu.awieclawski.bmi.exc.NotPositiveException;
import edu.awieclawski.bmi.srvc.Validator;

public abstract class Human {
	private double zero = 0.0;

//	@NotNull
//	@Min(18)
//	@Max(199)
	private int age;

//	@NotNull
//	@Max(500)
	private double weight;

//	@NotNull
//	@Max(3)
	private double height;

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
