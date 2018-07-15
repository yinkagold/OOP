package ass10;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		double y = 0;
		Scanner input;
		input = new Scanner(System.in);

		try {
			System.out.println("Enter an integer X ");
			int x = input.nextInt();
			y = (double) (3 * x - 1) / (x);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.printf("y: " + "%.2f\n", y);
	}

}
