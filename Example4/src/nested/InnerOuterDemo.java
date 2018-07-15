package nested;

import java.util.*;
import java.text.*;

class Statistics {

	private double values[];
	private double stdDev;
	private double avg;

	Statistics(double values[]) {

		this.values = new double[values.length];
		// Here we copy the content of array values[] to array
		// this.values[] using arraycopy() method:
		// arraycopy(srce, srcPos, dest, destPos, length)
		System.arraycopy(values, 0, this.values, 0, values.length);

	}

	void display() {

		// Here we define a decimal format object for displaying numbers
		// with 4 decimal digits.
		DecimalFormat decimalFormt = new DecimalFormat("0.0000");
		for (int i = 0; i < values.length; i++)
			System.out.print(decimalFormt.format(values[i]) + "\n ");

		// Here we create an object of the inner class Indicators
		Indicators indicators = new Indicators();

		// Here we call methods of indicators object.
		System.out.println("\nAverage: "
				+ decimalFormt.format(indicators.getAverage()));
		System.out.println("Stdandar Deviation: "
				+ decimalFormt.format(indicators.getStdDeviation()));
	}

	// Here we define inner class
	class Indicators {

		// Here we define method getAvg() for class Indicators
		double getAverage() {
			double sum = 0.0;

			// Note that the inner class has access to all members of
			// the enclosing (outer) class
			for (int i = 0; i < values.length; i++)
				sum += values[i];

			avg = (double) sum / (values.length);

			return avg;
		}

		// Here we define method getstdDev() for class Indicators
		double getStdDeviation() {
			double sum = 0.0;

			// Here we calculate the average
			avg = getAverage();

			// Note that the inner class has access to all members of
			// the enclosing class
			for (int i = 0; i < values.length; i++)
				sum += Math.pow((values[i] - avg), 2);

			stdDev = Math.sqrt(sum / values.length);

			return stdDev;
		}

	} // This is the end of the inner class
} // This is the end of the outer class

public class InnerOuterDemo {
	public static void main(String args[]) {

		int size = 10;
		double measurements[] = new double[size];
		Random r = new Random();

		// Here we initialize array measurements[]
		// with decimal numbers randomly
		for (int i = 0; i < measurements.length; i++)
			measurements[i] = r.nextDouble();

		// Here we instantiate class Statistics
		Statistics statistics = new Statistics(measurements);

		statistics.display();

	}
}