package edu.awieclawski.bmi.base;

import java.math.BigDecimal;

public interface I_Human {

	public final static BigDecimal MIN_BMI = BigDecimal.ZERO;
	public final static BigDecimal MAX_BMI = BigDecimal.valueOf(99);
	final static String CNNT = "cannot be null!";
	public final static String WGHT_NOTNULL = "Weight " + CNNT;
	public final static String HGHT_NOTNULL = "Height " + CNNT;
	public final static String AGE_NOTNULL = "Age " + CNNT;
	public final static String AGE_MINSTR = "18";
	public final static String AGE_MAXSTR = "199";
	public final static BigDecimal AGE_MIN = new BigDecimal(AGE_MINSTR);
	public final static BigDecimal AGE_MAX = new BigDecimal(AGE_MAXSTR);
	final static String SNBLT = "should not be less than ";
	final static String SNBGT = "should not be greater than ";
	public final static String AGE_MINTXT = "Age " + SNBLT + AGE_MINSTR;
	public final static String AGE_MAXTXT = "Age " + SNBGT + AGE_MAXSTR;
	public final static String WGHT_MINSTR = "1";
	public final static String WGHT_MAXSTR = "499";
	public final static BigDecimal WGHT_MIN = new BigDecimal(WGHT_MINSTR);
	public final static BigDecimal WGHT_MAX = new BigDecimal(WGHT_MAXSTR);
	public final static String WGHT_MINTXT = "Weight " + SNBLT + WGHT_MINSTR;
	public final static String WGHT_MAXTXT = "Weight " + SNBGT + WGHT_MAXSTR;
	public final static String HGHT_MINSTR = "1";
	public final static String HGHT_MAXSTR = "3";
	public final static BigDecimal HGHT_MIN = new BigDecimal(HGHT_MINSTR);
	public final static BigDecimal HGHT_MAX = new BigDecimal(HGHT_MAXSTR);
	public final static String HGHT_MINTXT = "Height " + SNBLT + HGHT_MINSTR;
	public final static String HGHT_MAXTXT = "Height " + SNBGT + HGHT_MAXSTR;

}
