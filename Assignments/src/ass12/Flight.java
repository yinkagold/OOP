package ass12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight implements Serializable {
	
	private int flightId;
	private String DateTime;
	private String origin;
	private String destination;
	private int duration;
	private double price;
	
	// constructor
	
	public Flight(int flightId, String DateTime, String origin, String destination, double price){
		this.flightId = flightId;
		this.DateTime = DateTime;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
	}
	/*private void addFlight() {
	    int flightId, duration;
	    String origin, destination, date, time;
	    double price;
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Adding flight");

	    System.out.print("Flight ID: ");
	    flightId = this.scanner.nextInt();

	    System.out.print("Departure date: ");
	    date = this.scanner.next();

	    System.out.print("Departure time: ");
	    time = this.scanner.next();

	    System.out.print("Origin: ");
	    origin = this.scanner.next();

	    System.out.print("Destination: ");
	    destination = this.scanner.next();

	    System.out.print("Flight duration: ");
	    duration = this.scanner.nextInt();

	    System.out.print("Price: ");
	    price = this.scanner.nextDouble();

	    this.flights.add(new Flight(flightId, date, time, origin, destination, duration, price));

	    Flight.save(this.path, this.flights);
	}
	//The save method I call at the end is a static method in the Flight class:
	public static boolean save(String file, ArrayList<Flight> flights) {
	    try {
	        FileOutputStream fileOut = new FileOutputStream(file);
	        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
	        objOut.writeObject(flights);
	        objOut.close();

	        return true;
	    } catch (Exception e) {
	        return false;
	    }

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}
