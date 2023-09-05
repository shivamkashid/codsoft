package NumberGuessing;

public class MainNumber {
	public static void main(String[] args) {
		int b = 0, a = 0, itteration = 0;
		Game obj3 = new Game();
		UserNo obj4 = new UserNo();
		do {
			b = obj4.userInput();
			a = obj3.NoOfComputer();
			obj4.isCorrect(a, b);
			itteration++;

		} while (b != a);
		System.out.println("You gusses the number in " + itteration + "times");

	}

}
