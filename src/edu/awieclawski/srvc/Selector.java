package edu.awieclawski.srvc;

import edu.awieclawski.base.Comments;

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
