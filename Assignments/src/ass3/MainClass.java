package ass3;

public class MainClass {

	public static void main(String[] args) {
		Person[]person = new Person[5];
		person[0] = new Person("John",1.75,80);
		person[1] = new Person("Luke",1.78, 65);
		person[2] = new Person("Peter", 1.68,70);
		person[3] = new Person("Mark", 1.54,65);
		person[4] = new Person("Paul", 1.76,80);
		
		for(int i=0;i<person.length;i++){
			
			System.out.println(person[i].toString());
			System.out.println(person[i].identity());
			System.out.println();
			
			Person per = new Person(person[0]);
			System.out.println(per.toString());
			System.out.println(per.identity());
			System.out.println();
			
			System.out.println(per.compareTo(person[1]));
			System.out.println();
			
			System.out.println(person[1].compareTo(person[2]));
			System.out.println();
			
			System.out.println(person[1].higherWeight(person[1]));
			System.out.println();
		}

	}

}
