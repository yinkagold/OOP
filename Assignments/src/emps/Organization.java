package emps;

import workers.Worker;

public class Organization {

	public static void main(String[] args) {
	
		Employee employee = new Employee("Ola", "software specialist", 0.1,
				9.93, "23.05.15", 120, 12);
		System.out.println("Compile-time polymorphism");
		System.out.println(employee.toString());
		System.out.printf("Net Salary :%.2f\n", employee.getNetSalary());
		System.out.println("Total Tax :"+employee.getTotalTax());
		

		System.out.println("run-time polymorphism");
		Worker worker; // worker is an abstract class so it can't be instantiated but an object reference can be created
		worker = employee;
		System.out.println(worker.toString());
		System.out.printf("Net Salary :%.2f \n",worker.getNetSalary());
		System.out.println("Total Tax Paid:"+worker.getTotalTax());
		

	}

}
