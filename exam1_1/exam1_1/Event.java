package exam1_1;

import java.text.SimpleDateFormat;

public class Event implements IEvent {
	private String eventDate;
	private String eventName;
	private double ticketPrice;
	SimpleDateFormat date = new SimpleDateFormat("dd.MM.yy HH:mm");

	public Event() { // default constructor
		eventDate = "29.04.16 09:00";
		eventName = "Soccer day";
		ticketPrice = 25.99;

	}

	public Event(String eventDate, String eventName, double ticketPrice) { // constructor overloading 
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String updateEvent(String eventName,String eventDate, double ticketPrice) {
		if (this.eventName.equals(eventName)) {
			this.eventDate = eventDate;
			this.ticketPrice = ticketPrice;
			return toString();
		}

		else
			return "";
	}

	@Override
	public String toString() {
		return "Event [eventDate=" + eventDate + ", eventName=" + eventName
				+ ", ticketPrice=" + ticketPrice + "]";
	}

	@Override
	public String searchEvent(String eventName) {
		if (this.eventName.equals(eventName))
			return toString();
		else
			return "";
	}

}
