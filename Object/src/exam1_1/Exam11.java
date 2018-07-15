package exam1_1;

public class Exam11 {

	public static void main(String[] args) {

		Event[] event = new Event[3];
		event[0] = new Event("04.04.16 09:00", "Energy day", 30.00);
		event[1] = new Event();
		event[2] = new Event("15.04.16 09:00", "Food day", 15.99);

		for (int i = 0; i < event.length; i++) {
			System.out.println(event[i].toString());

		}
		System.out.println("Modified event information: ");
		for (int i = 0; i < event.length; i++) {
			System.out.println(event[i].updateEvent("Energy day", "10.04.15",
					27.90));

		}
		System.out.println("Searching based on event Name: ");
		for (int i = 0; i < event.length; i++) {
			System.out.println(event[i].searchEvent("Energy day"));
		}

	}

}
