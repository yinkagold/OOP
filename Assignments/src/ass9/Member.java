package ass9;

import java.util.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Member implements IMember {

	private String name;
	public Date membershipDate;
	private double membershipPrice;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Member() {
		name = "Unknown";
		// membershipDate = "not set";
		membershipPrice = 0.00;

	}

	public Member(String name, String membershipDate, double membershipPrice) {
		this.name = name;
		try {

			this.membershipDate = df.parse(membershipDate);
		} catch (ParseException e) {
			e.printStackTrace();

		}

		this.membershipPrice = membershipPrice;
	}

	public double updatePrice(double price) {
		return membershipPrice = price;
	}

	public String toString() {
		return "Name :" + name + " " + "Membership Duration :"
				+ membershipDuration() + " days" + " " + "Membership Price :"
				+ membershipPrice;
	}

	@Override
	public String search(String name) { // Member String search(name) //
										// defining a method
		// which returns an object of the class
		if (this.name.equals(name)) {
			return toString();
		} else
			return "Member does not exist";
	}

	@Override
	public int membershipDuration() {

		Date date = new Date();
		int diffDays = (int) ((date.getTime() - membershipDate.getTime()) / (1000 * 60 * 60 * 24));

		return diffDays;

	}
}