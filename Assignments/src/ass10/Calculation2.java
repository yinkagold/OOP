package ass10;

public class Calculation2 {

	public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
			int x = Integer.parseInt(args[i]);
			double y = 0;
			try {

				y = (double) (3 * x - 1) / (x);
			} catch (ArithmeticException e) {
				System.out.println("Division by zero error");
			}
			System.out.printf("y: " + "%.2f\n", y);
		}
	}

}
