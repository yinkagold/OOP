package ass12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the flight informtion: ");
		System.out.println("Flight id: ");
		String id = scan.next();
	
		System.out.println("Flight date: ");
		String date = scan.next();

		System.out.println("Flight time: ");
		String time = scan.next();

		System.out.println("Flight Origin: ");
		String origin = scan.next();

		System.out.println("Flight destination: ");
		String destination = scan.next();

		System.out.println("Flight duration in mins: ");
		double duration = scan.nextDouble();

		System.out.println("Flight price: ");
		double price = scan.nextDouble();

		Flight flight = new Flight(id, date, time, origin, destination, duration, price);

		try {
			File representsActualFile = new File(args[0]);

			if (!representsActualFile.exists())

				representsActualFile.createNewFile();

			FileWriter fileWriter = new FileWriter(representsActualFile, true);

			fileWriter.write(flight.toString() + "\r\n");

			fileWriter.close();

			System.out.println("Enter the id of the flight to search for!");

			String searchedId = scan.next();

			FileReader fileReader = new FileReader(representsActualFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			System.out.println("Flight information:");

			String line;

			while ((line = bufferedReader.readLine()) != null) {

				if (line.indexOf(searchedId) != -1)
					System.out.println(line);

			}

			scan.close();

			bufferedReader.close();

		} catch (Exception e) {

		}

	}

}
