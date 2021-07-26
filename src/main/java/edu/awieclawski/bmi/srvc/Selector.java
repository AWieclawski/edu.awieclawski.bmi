package edu.awieclawski.bmi.srvc;

import edu.awieclawski.bmi.base.Comments;

/**
 * The class that builds the description of the result of the BMI calculation
 * 
 * @author AWieclawski
 *
 */
public class Selector {

	public String buildComment(int tire) {
		String result = null;
		switch (tire) {
		case 1:
			result = Comments.UNDER.getDescription();
			break;

		case 2:
			result = Comments.NORMAL.getDescription();
			break;

		case 3:
			result = Comments.OVER.getDescription();
			break;

		case 4:
			result = Comments.OBESE.getDescription();
			break;

		default:
			result = Comments.NORESULT.getDescription();

		}

		return result;

	}

}
