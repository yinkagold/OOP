package nested2;

import java.text.DecimalFormat;
import java.util.*;

class Statistics {
	private double numbers[];
	private double average;
	private Random r;
	private	 int i;

	Statistics(int size) {
		r = new Random();
		numbers = new double[size];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = r.nextDouble();
	}

	double getAverage() {
		double sum = 0.0;
		for (int i = 0; i < numbers.length; i++)
			sum += numbers[i];
		average = (double) sum / (numbers.length);
		return average;
	}

	void display() {
		DecimalFormat df = new DecimalFormat("0.0000");
		for (int i = 0; i < numbers.length; i++) {

			class Generator {
				int i;
				Generator() { // default constructor where we initialize the
								// average attribute
					average = getAverage();
				}

				double getDifference() {
					return (numbers[i] - average);
				}

			}// end of inner class

			Generator g = new Generator(); // instantiating the inner class
											// generator
			System.out.println(df.format(numbers[i]) + "-" + df.format(average)
					+ "=" + df.format(g.getDifference()));
		}// end for
	} // end method display
} // end of the outer class

public class NestedDemo {

	public static void main(String[] args) {
		int nums = 10;
		Statistics statistics = new Statistics(nums);
		statistics.display();

	}

}
