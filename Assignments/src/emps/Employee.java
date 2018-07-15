package emps;

import java.io.ObjectInputStream.GetField;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import workers.Worker;

public class Employee extends Worker {

	private String hireDate;
	private double jobDuration;
	private double monthlyWorkHour;
	private double netSalary;
	private double taxAmount;
	
	public Employee(){
		super();
		hireDate = "unknown";
		jobDuration = 0.00;
		monthlyWorkHour = 0.00;
	}
	public Employee(String name, String job, double taxRate, double hourWage, String hireDate,double monthlyWorkHour, double jobDuration){
		super(name,job,taxRate,hourWage);
		this.hireDate = hireDate;
		this.jobDuration = jobDuration;
		this.monthlyWorkHour = monthlyWorkHour;
	}


	public double getNetSalary() { // abstract method implementation

		taxAmount = (monthlyWorkHour * hourWage) * taxtRate; 
		netSalary = ((monthlyWorkHour*jobDuration) * hourWage) - taxAmount; // total salary after deductions
		return netSalary;
	}

	public double getTotalTax() { // method implementation

		return taxAmount * jobDuration;

	}

	public String toString() {
		return super.toString() + " "+ "Hire Date :" + hireDate + " "
				+ "Job Duration(month) :" + jobDuration + " "
				+ "Monthly work hour(hours) :" + monthlyWorkHour;
	}

}
