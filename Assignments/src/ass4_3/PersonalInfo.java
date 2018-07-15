package ass4_3;

public class PersonalInfo {
	private String name;
	private int id;
	private String phone;
	private static int objectCount;

	public PersonalInfo() {
		name = "Gold";
		id = 495;
		phone = "0466166969";
		++objectCount;
	}
	public PersonalInfo(String name,int id,String phone){
		this.name = name;
		this.id = id;
		this.phone = phone;
		++objectCount;
		}
	public String toString(){
		
		return "Your name is : "+ name + "id is : " + id + "Phone number is :" + phone;
	}
	public PersonalInfo getInfo(String name){
		if(this.name.equals(name))
			return this;
		else 
			return null;
			
	}
	public String modifyInfo(int id,String name,String phone){
		
		
		
		if(this.id == id){
			this.name = name;
			this.phone = phone;
			
			return "Object was modified";
		}
		
		
		return "Object was not modified";
		
	}

}
