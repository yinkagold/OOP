package ass9_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {

		Vector<Member> vec = new Vector<Member>();

		vec.addElement(new Member("John", "15/04/2014", 26.5, "Vuorikatu", 14,
				65100, "Vaasa"));
		vec.addElement(new Member("Paul", "15/03/2015", 45.5, "Klmentikatu", 5,
				65200, "Vaasa"));
		vec.addElement(new Member("Peter", "15/06/2014", 22.5, "Mylukatu", 9,
				65100, "Vaasa"));
		vec.addElement(new Member("Archodula", "01/01/2016", 15.7, "Koulukatu",
				22, 65200, "Vaasa"));

		for (int i = 0; i < vec.size(); i++) {

			System.out.println(vec.elementAt(i).toString());
		}
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter name of customer");
		String name = input.nextLine();
		System.out.println("Enter Street name");
		String street_name = input.nextLine();
		System.out.println("Enter House number");
		int house_number = Integer.parseInt(input.nextLine());
		System.out.println("Enter postal code");
		int postal_code = Integer.parseInt(input.nextLine());
		System.out.println("Enter city");
		String city = input.nextLine();

		Date date = new Date();
		String newDate = df.format(date);
		vec.add(new Member(name, newDate, 15.5, street_name, house_number,
				postal_code, city));
		for (Member m : vec) {
			System.out.println(m.search(name));
		}

		System.out
				.println("Enter the member index to remove from the vector: ");
		int i = input.nextInt();
		vec.remove(i);
		for (Member m : vec) {
			System.out.println(m.toString());
		}
		;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter new Customer infomation to update ");
		System.out.println("-----------------------");
		System.out.println("Enter new name to update: ");
		String newName = scan.nextLine();
		System.out.println("Enter new Street name :");
		String newStreet_name = scan.nextLine();
		System.out.println("Enter new house number: ");
		int newHouse_number = scan.nextInt();
		System.out.println("Enter the new postal code: ");
		int newPostal_code = input.nextInt();
		System.out.println("Enter new city");
		String newCity = input.nextLine();
		System.out.println();

		System.out.println(newName + " " + df.format(date) + "" + 15.5 + " "
				+ newStreet_name + " " + newHouse_number + " " + newPostal_code
				+ " " + newCity);
		vec.setElementAt(new Member(newName, df.format(date), 15.5,
				newStreet_name, newHouse_number, newPostal_code, newCity), i);
		for (int j = 0; j < vec.size(); j++) {
			System.out.println(vec.elementAt(j));
		}
	}

}
