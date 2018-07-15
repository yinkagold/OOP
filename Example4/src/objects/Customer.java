package objects;

public class Customer {
	int id;
	String name;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	public void makeProduct() {
		new Products(1000, "Apple");
	}

}
