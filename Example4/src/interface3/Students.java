package interface3;

public class Students implements Graduate {
	String[] students; // array for students
	String [] name;
	int[] grades; // array for grades 

	public Students(String[] students, int[] grades) {
		this.students = students;
		this.grades = grades;
	}

	public boolean updateGrade(String name, int grade) {
		boolean updated = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i].equalsIgnoreCase(name)) {
				grades[i] = grade;
				updated = true;
				break;
			}
		}
		return updated;
	}

	public String getInfo(String name) {
		String info = "Student" + name + "Not found";
		for (int i = 0; i < students.length; i++) {
			if (students[i].equalsIgnoreCase(name)) {
				info = name + ": " + grades[i];
				break;
			}

		}
		return info;
	}

	public String getPassed(String name) {
		String message = name + " has failed !";

		for (int i = 0; i < students.length; i++) {
			if (students[i].equalsIgnoreCase(name)) {
				if (grades[i] > 0) {
					message = name + " has passed ";
				}
			}
		}
		return message;
	}
}
