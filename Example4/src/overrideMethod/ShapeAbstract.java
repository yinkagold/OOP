package overrideMethod;

public abstract class ShapeAbstract {
	
	private final String logo = "The is the logo of the abstract class Shape!";
	
	public abstract String area();
		void show(){
			System.out.println(logo);
		}
	}

