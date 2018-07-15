package ass6_2;

public class GeneralInfo {
	protected int id;
	protected String name;
	protected String phoneNumber;

	public GeneralInfo() {
		id = 0;
		name = "unknown";
		phoneNumber = "unknown";
	}

	public GeneralInfo(int id, String name, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;

	}
	public String toString(){
		return "id:" + id +" " + "name:" + name +" "+ "phoneNumber: " + phoneNumber;
	}
	
	
	public String getInfo(int id) {
		if (this.id == id) {
			return this.toString();
		}
		
		return "id = " +id + " was not found";
	}
}
