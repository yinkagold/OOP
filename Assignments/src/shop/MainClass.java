package shop;

public class MainClass {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		
		customer1.name = "Gold";
		customer1.phoneNumber = "+358466166969";
		customer1.purchase = 34.5;
		customer1.privileged = true;
		
		System.out.println(customer1.getPurchase());
		
		System.out.println(customer1.getInfo());
		
		Customer customer2 = new Customer();
		customer2.setValues("Jim", "+44 7465896", 98.4, true);
		
		System.out.println("Customer information :");
		System.out.println(customer2.getInfo());
		
		System.out.println("Customer purchase is " + customer2.getPurchase());
		
		                 

	}

}
