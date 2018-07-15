package boards;

import java.text.DecimalFormat;
import boards.WeightBoard;
import boards.Board;
import boards.ColorBoard;

public class BoardMain {
	public static void main(String args[]) {
		ColorBoard colorBoard1 = new ColorBoard(10, 5, 30, "green");
		ColorBoard blueColorBoard = new ColorBoard(20, 40, "blue");
		ColorBoard colorBoard2 = new ColorBoard();
		ColorBoard cloneColorBoard = new ColorBoard(colorBoard1);

		// Here we define our own decimal number presentation format
		DecimalFormat df = new DecimalFormat("0.0000");

		System.out.println("Area of colorBoard1: " + colorBoard1.area());

		// Here we apply our own decimal number presentation format
		System.out.println("Weight/SquareMeter of colorBoard1: "
				+ df.format(colorBoard1.weightPSM()));

		System.out.println("Weight of colorBoard1: " + colorBoard1.getWeight());
		System.out.println("Color of colorBoard1: " + colorBoard1.getColor());
		System.out.println();

		System.out.println("Area of colorBoard2: " + colorBoard2.area());

		// Here we apply our own decimal number presentation format
		System.out.println("Weight/SquareMeter of colorBoard2: "
				+ df.format(colorBoard2.weightPSM()));

		System.out.println("Weight of colorBoard2: " + colorBoard2.getWeight());
		System.out.println("Color of colorBoard2: " + colorBoard2.getColor());

		System.out.println();

		System.out.println("Area of blueColorBoard: " + blueColorBoard.area());

		// Here we apply our own decimal number presentation format
		System.out.println("Weight/SquareMeter of colorBoard1: "
				+ df.format(blueColorBoard.weightPSM()));

		System.out.println("Weight of blueColorBoard: "
				+ blueColorBoard.getWeight());
		System.out.println("Color of blueColorBoard: "
				+ blueColorBoard.getColor());

		System.out.println();

		System.out.println("Area of myclone: " + cloneColorBoard.area());

		// Here we apply our own decimal number presentation format
		System.out.println("Weight/SquareMeter of colorBoard1: "
				+ df.format(cloneColorBoard.weightPSM()));

		System.out.println("Weight of myclone: " + cloneColorBoard.getWeight());
		System.out.println("Color of myclone: " + cloneColorBoard.getColor());

		System.out.println();

		// Here we compare objects of RectColor class with one another
		System.out.println("colorBoard1==colorBoard2: "
				+ colorBoard1.compare(colorBoard2));
		System.out.println("colorBoard1==blueColorBoard: "
				+ colorBoard1.compare(blueColorBoard));
		System.out.println("colorBoard1==myclone: "
				+ colorBoard1.compare(cloneColorBoard));

	}
}
