package ass2;

public class Person {

	String name;
	double height;
	int weight;

	public Person(String name, double height, int weight) {
		this.height = height;
		this.weight = weight;
		this.name = name;

	}

	public String identity() {

		double bmi;
		String valueBmi;
		bmi = weight / (height * height);
		if (bmi < 20) {
			valueBmi = "under weight";
		} else if (bmi >= 20 && bmi < 25) {
			valueBmi = "normal weight";
		} else if (bmi >= 25 && bmi < 30) {
			valueBmi = "slightly overweight";
		} else if (bmi >= 30 && bmi < 40) {
			valueBmi = "significantly Overweight";
		} else if (bmi >= 40) {
			valueBmi = "obesity";
		} else {
			return "unknown";
		}
		return valueBmi;
	}

	public String getInfo() {

		return name + ":" + " " + "Height =" + height + " " + "Weight ="
				+ weight;
	}
	public Person(Person persons){
		
		this.name = persons.name;
		this.height = persons.height;
		this.weight = persons.weight;
	}
	public Person higherHeight(Person person){
		
		
		if(this.height>=person.height)
			return this;
		else 
			return person;
		
		
	}

}
