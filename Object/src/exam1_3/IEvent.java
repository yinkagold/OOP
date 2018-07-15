package exam1_3;

public interface IEvent {
	
	public abstract String updateEvent(String eventName, String eventDate, double ticketPrice);
	public abstract String searchEvent(String eventName);

}
