package NumberGuessing;

import java.util.Random;

public class Game {
	int a;

	public Game() {
		Random obj = new Random();
		a = obj.nextInt(100);
		System.out.println("guess the number");
	}

	public int NoOfComputer() {
		return a;

	}
}
