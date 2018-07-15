package main;

import java.util.Scanner;

public class MatrixCalc {

	Scanner input;
	int matrix1[][], matrix2[][], row, column;
	int sum[][];
	int sub[][];
	int mult[][];

	void create() {

		input = new Scanner(System.in);

		System.out.println("\nEnter the number of rows");

		row = Integer.parseInt(input.nextLine());

		System.out.println("\nEnter the number of columns");

		column = Integer.parseInt(input.nextLine());

		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		sum = new int[row][column];
		sub = new int[row][column];
		mult = new int[row][column];

		System.out.println("Enter the elements of matrix1");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				matrix1[i][j] = input.nextInt();
			}
		}

		System.out.println("Enter the elements of matrix2");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				matrix2[i][j] = input.nextInt();
			}
		}

	}

	void display() {

		System.out.println("The elements entered for matrix1 are :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print("\t" + matrix1[i][j]);
			}

			System.out.println();
		}

		System.out.println("The elements of matrix2 are :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print("\t" + matrix2[i][j]);
			}
			System.out.println();
		}

	}

	void add() {

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}

		}
		System.out.println("\n\nThe sum of matrices is :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print("\t" + sum[i][j]);

			}
			System.out.println();
		}

	}

	void sub() {

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				sub[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}

		System.out.println("The subtraction of the matrices is:");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print("\t" + sub[i][j]);
			}

			System.out.println();
		}
	}

	void mult() {

		for (int i = 0; i < row; i++) {

			for (int k = 0; k < column; k++) {

				for (int j = 0; j < column; j++) {

					mult[i][k] += matrix1[i][j] * matrix2[j][k];
				}
			}
		}
		System.out.println("The multiplication of the matrices is :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print("\t" + mult[i][j]);
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		MatrixCalc calc = new MatrixCalc();
		calc.create();
		calc.display();
		calc.add();
		calc.sub();
		calc.mult();

	}

}
