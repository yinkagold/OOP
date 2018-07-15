package products;

public class Item {
	String name;
	int id;
	double unitPrice;

	 Item() { // here if in different packages, they become invisible 
		name = "not known";
		
		
	}
	 Item(String name, int id, double unitPrice){
		
		this.name = name;
		this.id = id;
		this.unitPrice = unitPrice;
	}

}
