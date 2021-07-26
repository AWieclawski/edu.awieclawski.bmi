package edu.awieclawski.bmi.base;

public enum Comments {
	UNDER("Underweight"), NORMAL("Normal range"), OVER("Overweight (Pre-obese)"), OBESE("Obese"),
	NORESULT("Result out of range! "), ERROR("Something went wrong! ");

	String description;

	Comments(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
