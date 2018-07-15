package workers;

public abstract class Worker {
	protected String name;
	protected String job;
	protected double taxtRate;
	protected double hourWage;

	public abstract double getNetSalary(); // abstract method

	public abstract double getTotalTax(); // abstract method

	public Worker() {
		name = "unknown";
		job = "not assigned";
		taxtRate = 0.00;
		hourWage = 0.00;
	}

	public Worker(String name, String job, double taxtRate, double hourWage) {
		this.name = name;
		this.job = job;
		this.taxtRate = taxtRate;
		this.hourWage = hourWage;
	}

	public String toString() {
		return "Name :" + name + " " + "Job :" + job + " " + "Tax Rate :"
				+ taxtRate + " " + "Hour wage(euros) :" + hourWage;
	}
}
