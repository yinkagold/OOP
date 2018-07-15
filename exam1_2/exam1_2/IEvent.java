package exam1_2;

public interface IEvent {
	
	public abstract String updateEvent(String eventName, String eventDate, double ticketPrice);
	public abstract String searchEvent(String eventName);

}
