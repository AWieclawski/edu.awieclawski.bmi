package edu.awieclawski.bmi.base;

public interface I_Human {

	public final static double MIN_BMI = 0;
	public final static double MAX_BMI = 99;
	final static String CNNT = "cannot be null!";
	public final static String WGHT_NOTNULL = "Weight " + CNNT;
	public final static String HGHT_NOTNULL = "Height " + CNNT;
	public final static String AGE_NOTNULL = "Age " + CNNT;
	public final static int AGE_MIN = 18;
	public final static int AGE_MAX = 199;
	final static String SNBLT = "should not be less than ";
	final static String SNBGT = "should not be greater than ";
	public final static String AGE_MINTXT = "Age " + SNBLT + AGE_MIN;
	public final static String AGE_MAXTXT = "Age " + SNBGT + AGE_MAX;
	public final static int WGHT_MIN = 1;
	public final static int WGHT_MAX = 499;
	public final static String WGHT_MINTXT = "Weight " + SNBLT + WGHT_MIN;
	public final static String WGHT_MAXTXT = "Weight " + SNBGT + WGHT_MAX;
	public final static int HGHT_MIN = 1;
	public final static int HGHT_MAX = 3;
	public final static String HGHT_MINTXT = "Height " + SNBLT + HGHT_MIN;
	public final static String HGHT_MAXTXT = "Height " + SNBGT + HGHT_MAX;

}
