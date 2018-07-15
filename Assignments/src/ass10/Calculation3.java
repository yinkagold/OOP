package ass10;

import java.util.Scanner;

public class Calculation3 {
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	double y = 0;

	public double calculate() {
		return y = (double) (3 * x - 1) / (x);
	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter an integer for x");
			Calculation3 cal = new Calculation3();
			System.out.printf("y: " + "%.2f\n",cal.calculate());
		} catch (ArithmeticException e) {
			System.out.println("Division error");
		}

	}

}
