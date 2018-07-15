package interfaces;

public class S_relation {
	public static void main(String args[]) {
		Remember r;
		r = new Friend("David");
		r.contact("Mia"); // implemented method of the friend class is called
		
		Relative rel = new Relative("Vicky");
		rel.contact("VIctor");
		
		r = rel; // the implemented method of the relative class is called
		r.contact("Nick");
		//r.print() // the object of an interface can't access other class methods excepts its abstract method
		
		
	}
}
