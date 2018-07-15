package ass8;

import java.util.Arrays;

public class Customer {
	private String name;
	private String address;
	private Account[] accounts;
	private double taxRate;
	private double taxPaid, totalTax, totalProfit;

	public Customer() {
		name = "unknowm";
		address = "not assigned";
		Account[] accounts = {};

	}

	public Customer(String name, String address, Account[] accounts) {
		this.name = name;
		this.address = address;
		this.accounts = accounts;
		this.taxRate = taxRate;
		
	}

	public double getTotalTax(String accountNumber) {
		double taxPaid = 0;
		for (Account ac : accounts) {
			if(accountNumber==ac.accountNumber){
			taxPaid = ac.getTotalTax();
			}
		}
		return taxPaid;

	}
	public double getTotalTax(){
		totalTax = 0;
		for(Account ac : accounts){
			totalTax += ac.getTotalTax();
		}
		return totalTax;
	}

	public double getTotalProfit() {
		double totalProfit = 0;

		for (Account ac : accounts) {
			totalProfit += ac.getProfit();
		}

		return totalProfit;
	}

	public String toString() {
		return "Name :" + name + " " + "Address :" + address + " "
				+ "Accounts :" + Arrays.toString(accounts) + "" + "Total Tax :"
				+ getTotalTax("accountNumber") + "" + "Total Profit :"
				+ getTotalProfit();
	}
}
