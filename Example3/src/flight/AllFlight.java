package flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AllFlight {
	private static final Object[] Exam12 = null;
	int id;
	String origin;
	String destination;
	Date date;
	int time;
	double price;

	public AllFlight(AllFlight tk) {
		this.id = tk.id;
		this.origin = tk.origin;
		this.destination = tk.destination;
		this.date = tk.date;
		this.time = tk.time;
		this.price = tk.price;
	}

	public AllFlight(int id, String origin, String destination, Date date,
			int time, double price) {
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.time = time;
		this.price = price;
	}

	public AllFlight getDescription(int id) {
		if (this.id == id)
			return this;
		else
			return null;
	}

	public void changeDateTime(int id, Date date, int time) {
		this.date = date;
		this.time = time;
	}

	public String toString() {
		return "OurTicket [TicketCode=" + id + ", Start=" + origin
				+ ", FinalDestination=" + destination + ", date=" + date
				+ ", time = " + time + ", price=" + price + "]";
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		AllFlight ticket;
		AllFlight ti1 = new AllFlight(01, "Helsinki(FIN)", "Stockholm(SWE)",
				date.parse("13/09/2014"), 20, 500.00);
		AllFlight ti2 = new AllFlight(02, "Zurich(SWZ)", "Paris(FRN)",
				date.parse("20/12/2014"), 13, 750.00);
		AllFlight ti3 = new AllFlight(03, "Newyork(USA)", "Kathmandu(NPL)",
				date.parse("12/01/2015"), 15, 6000.00);

		ticket = new AllFlight(ti1);

		System.out.println(ticket.getDescription(1));

		ti1.changeDateTime(01, date.parse("13/09/2015"), 12);
		ti3.changeDateTime(02, date.parse("20/12/2015"), 23);

		System.out.println(ti1.toString());
		System.out.println(ti2.toString());
		System.out.println(ti3.toString());

		try {

			FileOutputStream fos = new FileOutputStream(args[0], true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (int i = 0; i < Exam12.length; i++) {
				oos.writeObject(Exam12[i]);

			}

			oos.flush();
			oos.close();

		} catch (IOException ex) {

		} catch (ArrayIndexOutOfBoundsException ey) {
			System.out
					.println("Program needs two arguments!");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ticket id: ");
		String Exam12Id = scanner.next();

		try {

			FileOutputStream fos = new FileOutputStream(args[0], true);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (int i = 0; i < Exam12.length; i++)
				oos.writeObject(Exam12[i]);

			oos.flush();
			oos.close();
			fos.close();

		} catch (IOException e) {

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("Program needs two arguments!");
		}

		try {

			FileInputStream fis = new FileInputStream(args[0]);

			ObjectInputStream ois = new ObjectInputStream(fis);

			AllFlight tempExam12 = null;

			System.out.println("Now printing out the content of " + args[0]);

			while (ois != null) {

				tempExam12 = (AllFlight) ois.readObject();

				if (tempExam12.pick(args[1]) == null)
					System.out.println(tempExam12);

			}

			ois.close();

			fis.close();

		} catch (IOException e) {

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("Program needs two arguments!\n Usage: java ObjectInOut file_name Ticket_id");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + e);
		}

	}

	private Object pick(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}