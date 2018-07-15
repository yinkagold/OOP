package ass7;

public class Firm {

	public static void main(String[] args) {
		/*
		 * GeneralInfo genInfo = new GeneralInfo("Ola", 495, "0466166969");
		 * Employee employ = new Employee("Ola", 495, "0466166969", "Architect",
		 * 4000);
		 * 
		 * String[] projects = { "Structures", "Rail" }; Manager manager = new
		 * Manager("Ola", 495, "0466166969", "Architect", 4000.0, projects);
		 * System.out.println("Compile-time ploymorphism");
		 * System.out.println(genInfo.getInfo(495));
		 * System.out.println(employ.getInfo(495));
		 * System.out.println(manager.getInfo(495));
		 * 
		 * System.out.println("run-time ploymorphism");
		 * 
		 * genInfo = employ; System.out.println(genInfo.getInfo(495)); genInfo =
		 * manager; System.out.println(genInfo.getInfo(495));
		 */

		GeneralInfo genInfo;
		Employee employ = new Employee("Ola", 495, "0466166969", "Architect",
				4000);
		String[] projects = { "Structures", "Rail" };
		Manager manager = new Manager("Ola", 495, "0466166969", "Architect",
				4000.0, projects);
		genInfo = employ;

		System.out.println(genInfo.getinfo(495));
		genInfo = manager;
		System.out.println(genInfo.getinfo(495));
		System.out.println(manager.getinfo(495));

	}

}
