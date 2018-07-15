package interfaces;

public class Relative implements Remember {
	private String name;
	public Relative(String name){
		this.name = name;
	}
	void print(){
		System.out.println("This is the object for relatives" + name);
	}
	public void contact(String name){
		System.out.println(name + "Please call me !" );
	}

}
