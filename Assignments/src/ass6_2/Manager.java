package ass6_2;

import java.util.Arrays;

public class Manager extends Employee {
	private String [] projects;
	
	public Manager(){
		super();
		
		
	}
	public Manager(int id, String name, String phoneNumber,String job, double salary, String[] projects){
		super(id,name,phoneNumber,job,salary);
		this.projects = projects;
	}
	public String toString(){
		return super.toString() + " " + "Projects :" + Arrays.toString(projects);
	}
	
	}

