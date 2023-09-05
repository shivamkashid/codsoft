package StudentGradeCalculator;

import java.util.Scanner;

public class StudentSubject {
	Scanner obj = new Scanner(System.in);
	int maths;
	int science;
	int socialscience;
	int Hindi;
	int Marathi;
	int English;

	public void student() {
		int Average;
		int sum;
		System.out.println("enter your maths marks:");
		maths = obj.nextInt();
		System.out.println("enter your science marks:");
		science = obj.nextInt();
		System.out.println("enter you socialscience marks:");
		socialscience = obj.nextInt();
		System.out.println("enter your hindi marks:");
		Hindi = obj.nextInt();
		System.out.println("enter your marathi marks:");
		Marathi = obj.nextInt();
		System.out.println("enter your English marks:");
		English = obj.nextInt();
		sum = maths + science + socialscience + Hindi + Marathi + English;
		System.out.println("Total marks:" + sum);
		Average = sum / 6;
		System.out.println("you got :" + Average + " % marks");
	 if (maths < 35) {
			System.out.println("you got failed");

		} else if (science < 35) {
			System.out.println("you got failed");
		} else if (socialscience < 35) {
			System.out.println("you got failed");
		} else if (Hindi < 35) {
			System.out.println("you got failed");
		} else if (English < 35) {
			System.out.println("you got failed");
		} else if (Marathi < 35) {
			System.out.println("you got failed");
		} 
		else if (Average > 90) {
			System.out.println("Congrats you got A+ GRADE");

		} else if (Average < 90 && Average > 80) {
			System.out.println("congrats you got A GRADE");
		} else if (Average < 80 && Average > 60) {
			System.out.println("Congrats you got B Grade");

		} else if (Average < 60 && Average > 35) {
			System.out.println("Congrats you got C Grade");
		}else {
			System.out.println("Oooh... you got failed Please Work Hard and Comeback Stronger");
		}
	}

}

