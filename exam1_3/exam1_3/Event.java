package exam1_3;

import java.text.SimpleDateFormat;

import exam1_1.IEvent;

public class Event implements IEvent {
	private String eventDate;
	private String eventName;
	private double ticketPrice;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Event() { // default constructor
		eventDate = "29.04.2016 09:00";
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
