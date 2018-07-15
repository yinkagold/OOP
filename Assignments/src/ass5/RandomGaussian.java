package ass5;

import java.util.Random;
import java.util.Scanner;

public class RandomGaussian {

	public static void main(String[] args) {

		Random r = new Random();
		double sum = 0;
		double average = 0.0;

		int n = Integer.parseInt(args[0]);
		double[] numbers = new double[n];

		System.out.println("The given positive integer is : " + n);

		for (int i = 0; i < args.length; i++) {

			for (int j = 0; j < n; j++) {
				
				numbers[j] = r.nextGaussian();
				sum += numbers[j];

				System.out.printf("%10.1f\n", numbers[j]);
			}

			average = sum / n;
			System.out.printf("Average: %10.2f \n", average);
		}

		double deviation = 0;

		for (int j = 0; j < n; j++) {

			deviation += Math.pow(numbers[j] - average, 2.0);

		}

		deviation /= n;
		deviation = Math.sqrt(deviation);
		System.out.printf("Deviation :%10.2f", deviation);
	}
}


