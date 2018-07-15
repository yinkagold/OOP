package exam1_1;

public interface IEvent {
	
	public abstract String updateEvent(String eventName, String eventDate, double ticketPrice);
	public abstract String searchEvent(String eventName);

}
