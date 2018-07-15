package ass9_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ass9.IMember;

public class Member implements IMember {
	private String name;
	public Date membershipDate;
	private double membershipPrice;
	private Address address;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Member() {
		name = "Unknown";
		// membershipDate = "not set";
		membershipPrice = 0.00;

	}

	public Member(String name, String membershipDate, double membershipPrice,
			String street_name, int house_number, int postal_code, String city) {
		this.name = name;
		try {

			this.membershipDate = df.parse(membershipDate);
		} catch (ParseException e) {
			e.printStackTrace();

		}

		this.membershipPrice = membershipPrice;

		this.address = new Address(street_name, house_number, postal_code, city);

	}

	public double updatePrice(double price) {
		return membershipPrice = price;

	}

	@Override
	public int membershipDuration() {

		Date date = new Date();
		int diffDays = (int) ((date.getTime() - membershipDate.getTime()) / (1000 * 60 * 60 * 24));

		return diffDays;

	}

	public String search(String name) {
		if (this.name.equals(name)) {
			return toString();
		} else
			return "";
	}

	public String toString() { // here the members of the outer class are
		// visible to the inner class
		return "Name :" + name + " " + "Membership Duration :"
				+ membershipDuration() + " days" + " " + "Membership Price :"
				+ membershipPrice + "\n" + address;

	}

	public class Address { // inner class
		private String Street_name;
		private int house_number;
		private int postal_code;
		private String city;

		public Address() {
		}

		public Address(String street_name, int house_number, int postal_code,
				String city) {
			this.Street_name = street_name;
			this.house_number = house_number;
			this.postal_code = postal_code;
			this.city = city;

		}

		public String toString() {
			return "Street name: " + Street_name + " " + "House Number: "
					+ house_number + " " + "Postal code: " + postal_code + " "
					+ "City: " + " " + city;
		}

	} // end inner class

}
