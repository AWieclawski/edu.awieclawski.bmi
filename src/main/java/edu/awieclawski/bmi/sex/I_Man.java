package edu.awieclawski.bmi.sex;

import java.util.HashMap;
import java.util.Map;

import edu.awieclawski.bmi.base.I_Format;

/**
 * BMI table with data regarding Male
 * 
 * @author AWieclawski
 *
 */
public interface I_Man extends I_Format {

	final static boolean IS_MAN = true;
	final static double MIN_BMI = 0;
	final static double MAX_BMI = 99;
	final static double MIN_AGE = 18;
	final static double MAX_AGE = 199;
	final static String SEX = "Male";

	public static Map<double[], double[][]> getBMImap() {
		double[] key = new double[1];
		double[][] value = new double[1][4];
		Map<double[], double[][]> mapBMI = new HashMap<>();
		key = new double[] { MIN_AGE, 24 };
		value = new double[][] { { MIN_BMI, 20 }, { 20, 25 }, { 25, 29 }, { 29, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 24, 34 };
		value = new double[][] { { MIN_BMI, 21 }, { 21, 26 }, { 26, 30 }, { 30, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 34, 44 };
		value = new double[][] { { MIN_BMI, 22 }, { 22, 27 }, { 27, 31 }, { 31, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 44, 54 };
		value = new double[][] { { MIN_BMI, 23 }, { 23, 28 }, { 28, 32 }, { 32, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 54, 64 };
		value = new double[][] { { MIN_BMI, 24 }, { 24, 29 }, { 29, 33 }, { 33, MAX_BMI } };
		mapBMI.put(key, value);
		key = new double[] { 64, MAX_AGE };
		value = new double[][] { { MIN_BMI, 25 }, { 25, 30 }, { 30, 34 }, { 34, MAX_BMI } };
		mapBMI.put(key, value);

		return mapBMI;
	}
}
