package edu.awieclawski.bmi;

import java.math.BigDecimal;

import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;

public class StaticTester {

	public static void main(String[] args) {

		Man mm = new Man(new BigDecimal(18), new BigDecimal(77), new BigDecimal(1.8));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI()); // OK
		
		mm = new Man(new BigDecimal(18.1), new BigDecimal(77), new BigDecimal(1.8));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI()); // OK
		
		mm = new Man(new BigDecimal(19), new BigDecimal(-1), new BigDecimal(1.8));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(19), new BigDecimal(155), new BigDecimal(-2));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(-2), new BigDecimal(88), new BigDecimal(1.9));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(333), new BigDecimal(88), new BigDecimal(1.9));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(0), new BigDecimal(78.6), new BigDecimal(1.8));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(11), new BigDecimal(78.6), new BigDecimal(1.8));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(19), new BigDecimal(77), new BigDecimal(3.1));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		mm = new Man(new BigDecimal(19), new BigDecimal(777), new BigDecimal(1.7));
		System.out.println("\n" + mm.toString());
		System.out.println(mm.getCommentBMI());

		Woman wm = new Woman(new BigDecimal(18), new BigDecimal(56), new BigDecimal(1.7));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI()); // OK
		
		wm = new Woman(new BigDecimal(18.9), new BigDecimal(56), new BigDecimal(1.7));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI()); // OK

		wm = new Woman(new BigDecimal(0), new BigDecimal(78.6), new BigDecimal(1.8));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());
		
		wm = new Woman(new BigDecimal(11), new BigDecimal(78.6), new BigDecimal(1.8));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());

		wm = new Woman(new BigDecimal(19), new BigDecimal(155), new BigDecimal(-2));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());

		wm = new Woman(new BigDecimal(-2), new BigDecimal(88), new BigDecimal(1.9));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());

		wm = new Woman(new BigDecimal(333), new BigDecimal(88), new BigDecimal(1.9));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());

		wm = new Woman(new BigDecimal(19), new BigDecimal(77), new BigDecimal(3.1));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());

		wm = new Woman(new BigDecimal(19), new BigDecimal(777), new BigDecimal(1.6));
		System.out.println("\n" + wm.toString());
		System.out.println(wm.getCommentBMI());

	}

}
