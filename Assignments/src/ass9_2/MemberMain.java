package ass9_2;

public class MemberMain {

	public static void main(String[] args) {
		/*Member mem = new Member("John", "15/04/2014", 26.5, "Vuorikatu",14,65100,"Vaasa");
		//Member.Address add = mem.new Address("Vuorikatu",14,65100,"Vaasa"); // instantiating inner from outer class 
		//System.out.println(add.toString());
		System.out.println(mem.toString());
		System.out.println(mem.search("John", 26.5));*/
		
		Member[] mems = new Member[3];
		mems[0] = new Member("John", "15/04/2014", 26.5, "Vuorikatu",14,65100,"Vaasa");
		mems[1] = new Member("Paul", "15/03/2015", 45.5, "Klmentikatu",5,65200,"Vaasa");
		mems[2] = new Member("Peter", "15/06/2014", 22.5, "Mylukatu",9,65100,"Vaasa");
		
		for(int i= 0; i<mems.length;i++)
			System.out.println(mems[i].toString());
		for(int i= 0;i<mems.length;i++)
		System.out.println(mems[i].search("Paul"));
		

	}

}
