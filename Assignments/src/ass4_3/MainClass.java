package ass4_3;


public class MainClass {
	
	public static void generateObject(PersonalInfo[] p, int index, String name, int id, String phone){
		p[index] = new PersonalInfo(name,id,phone);
		
	}
	public static void main(String[] args) {
		int size = 5;
		PersonalInfo personal[] = new PersonalInfo[5];
		
		int  id=1000;
		String phone = "046616696";
		String name []= {"Gold"};
		
		
		for(int i=0; i<personal.length; i++)
			generateObject(personal, i, "name" + i +" ", id+i, phone+i);
		
		
		for(int i=0;i<personal.length;i++)
			System.out.println(personal[i]);
		
		
		
	}

}
