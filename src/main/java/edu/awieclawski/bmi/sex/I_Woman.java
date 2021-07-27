package edu.awieclawski.bmi.sex;

import java.util.HashMap;
import java.util.Map;

import edu.awieclawski.bmi.base.Human;
import edu.awieclawski.bmi.base.I_Format;

/**
 * BMI table with data regarding Female
 * 
 * @author AWieclawski
 *
 */
public interface I_Woman extends I_Format {

	final static boolean IS_MAN = false;
	final static double MIN_BMI = 0;
	final static double MAX_BMI = 99;
	final static String SEX = "Female";

	public static Map<double[], double[][]> getBMImap() {
		double[] key = new double[1];
		double[][] value = new double[1][4];
		Map<double[], double[][]> mapBMI = new HashMap<>();
		key = new double[] { Human.AGE_MIN, 24 };
		value = new double[][] { { MIN_BMI, 19 }, { 19, 24 }, { 24, 28 }, { 28, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 24, 34 };
		value = new double[][] { { MIN_BMI, 20 }, { 20, 25 }, { 25, 29 }, { 29, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 34, 44 };
		value = new double[][] { { MIN_BMI, 21 }, { 21, 26 }, { 26, 30 }, { 30, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 44, 54 };
		value = new double[][] { { MIN_BMI, 22 }, { 22, 27 }, { 27, 31 }, { 31, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 54, 64 };
		value = new double[][] { { MIN_BMI, 23 }, { 23, 28 }, { 28, 32 }, { 32, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 64, Human.AGE_MAX };
		value = new double[][] { { MIN_BMI, 24 }, { 24, 29 }, { 29, 33 }, { 33, MAX_BMI } };
		mapBMI.put(key, value);

		return mapBMI;
	}
}
