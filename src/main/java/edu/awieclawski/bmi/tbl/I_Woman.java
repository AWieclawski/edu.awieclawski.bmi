package edu.awieclawski.bmi.tbl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import edu.awieclawski.bmi.base.Human;

/**
 * BMI table with data regarding Female
 * 
 * @author AWieclawski
 *
 */
public interface I_Woman {

	final static boolean IS_MAN = false;
	final static String SEX = "Female";

	public static Map<BigDecimal[], BigDecimal[][]> getBMImap() {
		BigDecimal[] key = new BigDecimal[1];
		BigDecimal[][] value = new BigDecimal[1][4];
		Map<BigDecimal[], BigDecimal[][]> mapBMI = new HashMap<>();
		key = new BigDecimal[] { Human.AGE_MIN, new BigDecimal(24) };
		value = new BigDecimal[][] { { Human.MIN_BMI, new BigDecimal(19) }, { new BigDecimal(19), new BigDecimal(24) },
				{ new BigDecimal(24), new BigDecimal(28) }, { new BigDecimal(28), Human.MAX_BMI } };
		mapBMI.put(key, value);
		key = new BigDecimal[] { new BigDecimal(24), new BigDecimal(34) };
		value = new BigDecimal[][] { { Human.MIN_BMI, new BigDecimal(20) }, { new BigDecimal(20), new BigDecimal(25) },
				{ new BigDecimal(25), new BigDecimal(29) }, { new BigDecimal(29), Human.MAX_BMI } };
		mapBMI.put(key, value);
		key = new BigDecimal[] { new BigDecimal(34), new BigDecimal(44) };
		value = new BigDecimal[][] { { Human.MIN_BMI, new BigDecimal(21) }, { new BigDecimal(21), new BigDecimal(26) },
				{ new BigDecimal(26), new BigDecimal(30) }, { new BigDecimal(30), Human.MAX_BMI } };
		mapBMI.put(key, value);
		key = new BigDecimal[] { new BigDecimal(44), new BigDecimal(54) };
		value = new BigDecimal[][] { { Human.MIN_BMI, new BigDecimal(22) }, { new BigDecimal(22), new BigDecimal(27) },
				{ new BigDecimal(27), new BigDecimal(31) }, { new BigDecimal(31), Human.MAX_BMI } };
		mapBMI.put(key, value);
		key = new BigDecimal[] { new BigDecimal(54), new BigDecimal(64) };
		value = new BigDecimal[][] { { Human.MIN_BMI, new BigDecimal(23) }, { new BigDecimal(23), new BigDecimal(28) },
				{ new BigDecimal(28), new BigDecimal(32) }, { new BigDecimal(32), Human.MAX_BMI } };
		mapBMI.put(key, value);
		key = new BigDecimal[] { new BigDecimal(64), Human.AGE_MAX };
		value = new BigDecimal[][] { { Human.MIN_BMI, new BigDecimal(24) }, { new BigDecimal(24), new BigDecimal(29) },
				{ new BigDecimal(29), new BigDecimal(33) }, { new BigDecimal(33), Human.MAX_BMI } };
		mapBMI.put(key, value);

		return mapBMI;
	}
}
