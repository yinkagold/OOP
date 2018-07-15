package ass8;

import java.io.ObjectInputStream.GetField;

public class Account implements IAccount {

	public String accountNumber;
	private double balance;
	private double interestRate;
	private double taxRate;
	private double wealthAmount = 10000, debtAmount= 2500;
	double totalBalance, totalProfit, totalTax, duration = 1;

	public Account() {
		accountNumber = "Not assigned";
		balance = 0.00;
		interestRate = 0.00;
		taxRate = 0.00;
	}

	public Account(String accountNumber, double balance, double interestRate,
			double taxRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.taxRate = taxRate;
	}

	@Override
	public void setBalance() {
		balance = wealthAmount - debtAmount;
	}

	@Override
	public void setInterestRate() {
		interestRate = totalProfit / (wealthAmount * duration);

	}

	@Override
	public double getBalance() {
		return wealthAmount - debtAmount;
		
	}
	
	public double getTotalBalance() {
		return balance * (1-taxRate);
		
	}

	@Override
	public double getProfit() {
		 return totalProfit = (balance * interestRate) *(1- taxRate);
		
	}

	public double getTotalTax() {
		return totalTax = taxRate * getTotalBalance();
		
	}

	public String toString() {
		return "Name :" + name + " " + "Address :" + address + " "
				+ "Total Balance :" + getTotalBalance() + " " + "Total Profit :"
				+ getProfit() + " " + "Total Tax :" + getTotalTax();

	}

}
