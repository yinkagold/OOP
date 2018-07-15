package ass12;

public class Flight {

	private String id;
	private String date;
	private String time;
	private String origin;
	private String destination;
	private double duration;
	private double price;

	public Flight() {

	}

	public Flight(String id, String date, String time, String origin, String destination, double duration, double price) {
		this.id = id;
		this.date = date;
		this.time = time;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", date=" + date + ", time=" + time + ", origin=" + origin + ", destination="
				+ destination + ", duration=" + duration + ", price=" + price + "]";
	}

	public String search(String id) { // Member String search(name) //
		// defining a method
		// which returns an object of the class
		if (this.id.equals(id)) {
			return toString();
		} else
			return "Member does not exist";
	}

}
