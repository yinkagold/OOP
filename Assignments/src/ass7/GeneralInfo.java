package ass7;

public abstract class  GeneralInfo {
	protected String name;
	protected int id;
	protected String phoneNumber;
	public GeneralInfo(){ // default constructor
		name = "Unknown";
		id = 0;
		phoneNumber = "not valid";
	}
	public GeneralInfo(String name, int id, String phoneNumber){
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}	
	public String toString(){
		return "Name :" +" " + name + " " +"id :" + " " + id + " " + "PhoneNumber :" + " " + phoneNumber;
	}
	public abstract String getinfo(int id); // id is the argument to check the validity
	/*public String getInfo(int id){
		if(this.id == id){
			return this.toString();
		}
		else
			return "id not existing";
		
	}*/

}
