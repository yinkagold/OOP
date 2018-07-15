package ass6_2;

public class Employee extends GeneralInfo {
	protected String job;
	protected double salary;

	public Employee() {
		super();
		job = "unknown";
		salary = 0.0;
	}

	public Employee(int id, String name, String phoneNumber, String job,
			double salary) {
		super(id, name, phoneNumber);
		this.job = job;
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + " " + "Job :" + job + " " + "salary :"
				+ salary;
	}

}
