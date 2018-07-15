package ass7;

import java.util.Arrays;

public class Manager extends Employee {
	private String[] projects;
	
	public Manager(){
		super();
		
	}
	public Manager(String name, int id, String phoneNumber, String job, double salary, String []projects){
		super(name,id,phoneNumber,job,salary);
		this.projects= projects;
	}
	public String toString(){ // method overriding
		return super.toString() + "" + "Projects :" + "" +  Arrays.toString(projects);
	}
}
