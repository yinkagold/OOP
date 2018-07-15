package ass8;

public class Main {

	public static void main(String[] args) {
		Account[] accounts = { new Account("FI01", 200.30, 0.045, 0.29),
				new Account("FI02", 100.30, 0.025, 0.1) };
		Customer customer = new Customer("John", "Vuorikatu", accounts);

		System.out.println(customer.toString());
		System.out.println(customer.getTotalProfit());

		System.out.println(customer.getTotalTax("FI01"));
		System.out.println(customer.getTotalTax());

		Account act = new Account("FI01", 200.30, 0.054, 0.29);
		System.out.println(act.toString());
		System.out.println(act.getBalance());
		System.out.println(act.getTotalBalance());
		System.out.println(act.getProfit());
		System.out.println(act.getTotalTax());
		
		
	}

}
