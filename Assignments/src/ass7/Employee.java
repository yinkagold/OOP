package ass7;

public class Employee extends GeneralInfo {
	protected String job;
	protected double salary;

	public Employee() { // default constructor overloading
		super();
		job = "unknown";
		salary = 0.0;
	}

	public Employee(String name, int id, String phoneNumber, String job,
			double salary) { // overloading the constructor
		super(name, id, phoneNumber);
		this.job = job;
		this.salary = salary;
	}

	public String toString() { // method overriding 
		return super.toString() + " " + "Job :" + "" + job + " " + "Salary :"
				+ "" + salary;
	}

	public String getinfo(int id) { // here is the implementation of the abstract method
		if (this.id == id) {
			return super.toString();
		} else
			return "id not existing";
	}

}
