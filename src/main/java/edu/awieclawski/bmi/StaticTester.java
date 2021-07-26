package edu.awieclawski.bmi;

import edu.awieclawski.bmi.mdl.Man;
import edu.awieclawski.bmi.mdl.Woman;

public class StaticTester {

	public static void main(String[] args) {

		Man mm = new Man(19, -1, 1.8);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());

		mm = new Man(19, 155, -2);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());

		mm = new Man(-2, 88, 1.9);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());

		mm = new Man(333, 88, 1.9);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());

		mm = new Man(0, 78.6, 1.8);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());
		
		mm = new Man(11, 78.6, 1.8);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());

		mm = new Man(19, 222, 1.1);
		System.out.println("\n" + mm.toString());
		System.out.println(mm.commentBMI());
		
		Woman wm = new Woman(0, 78.6, 1.8);
		System.out.println("\n" + wm.toString());
		System.out.println(wm.commentBMI());

		wm = new Woman(11, 78.6, 1.8);
		System.out.println("\n" + wm.toString());
		System.out.println(wm.commentBMI());

		wm = new Woman(19, 155, -2);
		System.out.println("\n" + wm.toString());
		System.out.println(wm.commentBMI());

		wm = new Woman(-2, 88, 1.9);
		System.out.println("\n" + wm.toString());
		System.out.println(wm.commentBMI());

		wm = new Woman(333, 88, 1.9);
		System.out.println("\n" + wm.toString());
		System.out.println(wm.commentBMI());

	}

}
