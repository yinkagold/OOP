package flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewFlight {
	int id;
	String origin;
	String destination;
	Date date;
	int time;
	double price;

	public NewFlight(NewFlight tk) {
		this.id = tk.id;
		this.origin = tk.origin;
		this.destination = tk.destination;
		this.date = tk.date;
		this.time = tk.time;
		this.price = tk.price;
	}

	public NewFlight(int id, String origin, String destination, Date date,
			int time, double price) {
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.time = time;
		this.price = price;
	}

	public NewFlight getDescription(int id) {
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
		return "OurTicket [TicketCode=" + id + ", Start=" + origin + ", FinalDestination="
				+ destination + ", date=" + date + ", time = " + time
				+ ", price=" + price + "]";
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		NewFlight ticket;
		NewFlight ti1 = new NewFlight(01, "Helsinki(FIN)", "Stockholm(SWE)",
				date.parse("13/09/2014"), 20, 500.00);
		NewFlight ti2 = new NewFlight(02, "Zurich(SWZ)", "Paris(FRN)",
				date.parse("20/12/2014"), 13, 750.00);
		NewFlight ti3 = new NewFlight(03, "Newyork(USA)", "Kathmandu(NPL)",
				date.parse("12/01/2015"), 15, 6000.00);

		ticket = new NewFlight(ti1);

		System.out.println(ticket.getDescription(1));

		ti1.changeDateTime(01, date.parse("13/09/2015"), 12);
		ti3.changeDateTime(02, date.parse("20/12/2015"), 23);

		System.out.println(ti1.toString());
		System.out.println(ti2.toString());
		System.out.println(ti3.toString());
	}
}
