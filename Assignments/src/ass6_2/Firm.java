package ass6_2;

import java.util.Arrays;

import ass6_2.Employee;
import ass6_2.GeneralInfo;
import ass6_2.Manager;

public class Firm {

	public static void main(String[] args) {

		GeneralInfo genInfo = new GeneralInfo(400, "Gold", "0466166969");
		Employee employee = new Employee(400, "Ola", "0499166967", "Enginer",
				3000.0);

		String[] projects = { "Road", "Hospitals", "Schools" };

		Manager manager = new Manager(400, "Ola", "0466166969", "Engineer",
				4000, projects);
		Manager manager2 = new Manager(400, "Ola", "0466166969", "Engineer",
				4000, new String[]{projects[0], projects[1]});

		System.out.println(genInfo.getInfo(400));
		System.out.println(employee.getInfo(400));
		
		System.out.println(manager.getInfo(400));
		System.out.println(manager2.getInfo(400));

	}

}
