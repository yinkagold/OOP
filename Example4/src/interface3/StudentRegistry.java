package interface3;

public class StudentRegistry {

	public static void main(String[] args) {
		String[] names = { "Alfred", "Elton", "Johson", "Peter", "Bob" };
		int[] grades = new int[] { 3, 2, 1, 5, 0 };

		System.out.println("Current date :" + InitialRegistry.date);
		Students student = new Students(names, grades);
		String name = "Alfred";
		System.out.println(student.getInfo(name));
		name = "Johson";
		System.out.println(student.getInfo(name));
		student.updateGrade(name, 4);
		System.out.println("Info after updating info of " + name + ": ");
		System.out.println(student.getInfo(name));
		name = "Bob";
		System.out.println(student.getPassed(name));
	}

}
