package ass3;

public class Person {

	String name;
	double height;
	double weight;

	public Person() { // default constructor
		this.name = "Gold";
		this.height = 1.70;
		this.weight = 75;

	}
	// constructor with all parameters
	public Person(String name, double PersonHeight, double PersonWeight){
		this.name = name;
		this.height = PersonHeight;
		this.weight = PersonWeight;
		
		}
	public Person(double PersonHeight, double PersonWeight){
		this.name = "Unknown";
		this.height = PersonHeight;
		this.weight = PersonWeight;
		
	}
	public Person(Person person){
		this.name = person.name;
		this.height = person.height;
		this.weight = person.weight;
		
	}
	public String identity(){
		
		double bmi;
		String result;
		bmi = weight/(height*height);
		if(bmi < 20){
			result = "Underwight"; 
		}
		else if(20<=bmi&&bmi<25){
			result = "Normal weight";
		}
		else if(25<=bmi && bmi<30){
			result = "Slightly overweight";
		}
		else if(bmi>=40){
			result = "Obesity";
		}
		else
			result = "Unknown";
		return "You are " + result;
	}
	public String toString(){
		return name+ " " + "Your height is : " + height + " "+ "and wieight : " + weight;
		
	}
	public boolean compareTo(double height, double weight){
		if(this.height == height && this.weight == weight)
			return true;
		else return false;
	}
	public boolean compareTo(Person person){
		if(this.height == person.height && this.weight == person.weight)
			return true;
		else 
			return false;
		
	}
	public Person higherWeight(Person person){
	
		if(this.weight>=person.weight)
			return this;
		else
			return person;
		
	}
}
