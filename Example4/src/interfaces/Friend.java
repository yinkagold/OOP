package interfaces;

public class Friend implements Remember{
	private String name;
	public Friend(String name){
		this.name = name;
	}
	void greetings(){
	System.out.println("Hello Friends! ");
	}
public void contact(String name){
	System.out.println(name + "Please write to me !");
}

}
