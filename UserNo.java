package NumberGuessing;

import java.util.Scanner;

public class UserNo {
	public int userInput() {
		int b;
		System.out.println("Enter");
		Scanner obj2 = new Scanner(System.in);
		b = obj2.nextInt();
		return b;
	}

	public void isCorrect(int i, int j) {
		if (i == j) {
			System.out.println("Who....ooo you guessed correct no");
		} else if (i < j) {
			System.out.println("your no is bigger than computer number");
		} else {
			System.out.println("your no is smaller than computer number");
		}

	}
}
