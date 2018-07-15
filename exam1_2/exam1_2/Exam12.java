package exam1_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exam12 {

	public static void main(String[] args) {
		Hashtable<String, Event> program = new Hashtable<String, Event>();
		// adding elements to the hash table
		program.put(new String("Energy day"), new Event("04.04.16 09:00",
				"Energy day", 30.00));
		program.put(new String("Food day"), new Event("15.04.16 09:00",
				"Food day", 15.99));
		program.put(new String("Soccer day"), new Event("15.04.16 09:00",
				"Soccer day", 45.99));
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm");
		System.out.println("Enter new event information to update: ");
		System.out.println("-----------------------");
		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter event DateTime((in this format dd.MM.yy HH:mm) to update: ");
		String newEventDate = in.nextLine();
		System.out.println("Enter new event name to add:  ");
		String newEventName = in.nextLine();
		System.out.println("Enter new event price to add: ");
		double newTicketPrice = Double.parseDouble(in.nextLine());
		System.out.println();
		Date date = new Date();
		String newDate = df.format(date);

		program.put(new String(newEventName), new Event(newEventDate,
				newEventName, newTicketPrice));

		System.out.println("Added information: ");
		System.out.println("------------------------");
		Enumeration<String> names = program.keys();
		String name;

		while (names.hasMoreElements()) {
			name = names.nextElement();
			System.out.println(name + ":" + program.get(name));
		}

		Enumeration<String> ids = program.keys();
		System.out.println("---------------------------");
		System.out.println("Content of the hashtable: ");
		String ID = null;
		while (ids.hasMoreElements()) {
			ID = ids.nextElement();
			System.out.println(ID + " = " + program.get(ID));
		}
		System.out.println("Enter event name to get information:  ");

		Scanner input = new Scanner(System.in);
		String eventName = input.nextLine();
		Event event = program.get(eventName);
		System.out.println("Event with : " + eventName + "\n" + event);

		System.out.println("------------------------");
		System.out.println("Enter Event name to update: ");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter event name to update information: ");
		String eventNameUpdate = scan.nextLine();
		System.out.println("Event with : " + eventNameUpdate + "\n" + event);
		Event eventUpdate = program.get(newEventName);
		System.out.println("Enter the event date to update: ");
		String eventDateUpdate = scan.nextLine();
		System.out.println("Enter the event price to update: ");
		double ticketPriceUpdate = Double.parseDouble(scan.nextLine());
		event = new Event();
		program.put(eventNameUpdate, eventUpdate);
		System.out.println("--------------------");
		System.out.println("Updated contents: ");
		ids = program.keys();

		while (names.hasMoreElements()) {
			name = names.nextElement();
			System.out.println(name + ":" + program.get(name));
		}

	}

}
