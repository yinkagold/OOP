package exceptionHandling;

import java.util.Random;

public class RandomException {

	public static void main(String[] args) {
		int x, y, z=0;
		Random r = new Random();
		for (int i = 0; i < 5; i++) {

			try {
				x = r.nextInt();
				if (i % 2 == 0)
					y = 0;
				else
					y = x + 3;
				z = x / y;
			} catch (ArithmeticException e) {
				System.out.println("An exception has ocured !" + e);
				
			}
			System.out.println("z: " + z);
		}

	}

}