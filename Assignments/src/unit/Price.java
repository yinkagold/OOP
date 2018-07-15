package unit;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Price {
	int amount;
	double unit_price;
	String name;
	double price;

	public static void main(String[] args) {
		String text = "name=Milk;amount=200;unit_price=0.9\nname=Bread;amount=134;unit_price=3.48"
				+ "\nname=Butter;amount=58;unit_price=1.65\nname=Cheese;amount=260;unit_price=4.35";

		String[] products = text.split("\n");

		String[] attributeValues = null;
		String name;
		double price;
		double total_sum = 0;
		for (int i = 0; i < products.length; i++) {
			attributeValues = products[i].split(";");

			name = attributeValues[0].split("=")[1];
			price = Integer.parseInt(attributeValues[1].split("=")[1])
					* Double.parseDouble(attributeValues[2].split("=")[1]);

			System.out.println(name + " " + price);

			System.out.println();
			
			total_sum += price;
			System.out.println("total sum of product is :" + total_sum);

		}

	}
}
