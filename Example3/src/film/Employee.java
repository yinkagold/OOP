package film;

public class Employee {

	String name;
	int id;
	double salary;

	public Employee() { // here is the constructor
		// modifying the constructor
		name = "not known"; // name is declared to avoid the null default value

	}

	public Employee(String name, int id, double salary) {

		this.name = name; // this copies the attribute in the name as declared
							// above ; overloaded the constructor
		this.id = id;
		this.salary = salary; // to initialize with a value apart from the
								// default value

	}

	// another method to search an object with the id...
	public Employee search(int id) {

		if (this.id == id)
			return this;

		return null; // null is used to return an unidentified object
	}
	
	// to make clone:  passing an object not defined completely and giving it the same value
	// they must be instances of the same class 
	
	void makeColone(Employee e){
		e.id = this.id;
		e.name = this.name;
		e.salary = this.salary;
		
	}

	// define a method that takes in an argument,compares and print out

	public String compareEmployees(Employee e) { // comparing the previous with
													// the new "e"
		if (this.salary > e.salary)

			return "The employee with higher salary: " + this.getInfo();

		return "The employee with higer or equal salary: " + this.getInfo();

	}

	public String getInfo() { // to make it visible outside the package, make it
								// public
		return name + " " + id + " " + salary;
	}

	// overloading the above method to make it conditional
	public String getInfo(double salaryLimit) { // to make it visible outside
												// the package, make it public

		if (salary > salaryLimit)
			return getInfo(); // used instead of the whole return below
		// return name + " "+ id+ " "+ salary;

		return salary + "not greater than" + salaryLimit + "!";
	}

}