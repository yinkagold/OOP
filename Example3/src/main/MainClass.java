package main;

import film.Employee;

public class MainClass {

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		System.out.println(emp1.getInfo());

		emp1 = new Employee("Bill", 10000, 24354.6);
		System.out.println(emp1.getInfo());

		Employee emp2 = new Employee("John", 1700, 1500); // new object

		System.out.println(emp2.getInfo());

		double salaryLimit = 2500; // it is best changed here to affect all
									// others
		System.out.println("Employee, who have a salary greater than"
				+ salaryLimit);
		System.out.println(emp2.getInfo(salaryLimit));
		System.out.println(emp1.getInfo(salaryLimit));

		Employee emp3 = new Employee("Luke", 30000, 2800.95);

		System.out.println(emp2.compareEmployees(emp1));

		System.out.println(emp3.compareEmployees(emp1));
		
		Employee e5 = new Employee();
		
	//	emp2.makeClone(e5); // this will copy all the attributes of emp2 to e5
		
		System.out.println(emp2.compareEmployees(e5));

		int searchID = 2000;
		Employee foundObject = emp2.search(searchID);

		System.out.println("search result of employee with id: " + searchID
				+ " : ");
		if (foundObject != null)

			System.out.println(foundObject.getInfo());
		else
			System.out.println("Employee with " + searchID + " Was not found");

	}

}
