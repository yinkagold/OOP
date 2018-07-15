package ass10;

import java.util.Scanner;

public class Calculation4 extends Exception {
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	double y = 0;

	public double calculate() throws UnexpectedValueException{
		if (x < 10)
			return y = (double) (3 * x - 1) / (x);

		else
			throw new UnexpectedValueException();

	}

	public static void main(String[] args) throws UnexpectedValueException {
		try {
			System.out.println("Enter an integer for x");
			Calculation4 cal = new Calculation4();
			System.out.printf("y: " + "%.2f\n", cal.calculate());
		} catch (UnexpectedValueException e) {
			System.out.println("x must be less than 10");

		}

	}
}
