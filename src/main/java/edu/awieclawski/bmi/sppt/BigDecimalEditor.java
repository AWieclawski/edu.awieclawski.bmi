package edu.awieclawski.bmi.sppt;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BigDecimalEditor extends PropertyEditorSupport {

	private final static Logger LOGGER = Logger.getLogger(BigDecimalEditor.class.getName());

	public void setAsText(String text) {
		String number = "0";
		if (text != null) {
			number = text;

			// NumberFormat formatter = NumberFormat.getNumberInstance(Locale.ENGLISH);

			// catch exception if ex. number has comma instead of dot
			try {
				BigDecimal bigDecimal = new BigDecimal(number);
				setValue(bigDecimal);
			} catch (NumberFormatException e) {
				LOGGER.log(Level.SEVERE, e.getMessage() + "|" + number);
			}
		}
	}
}
