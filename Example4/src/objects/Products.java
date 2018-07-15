package objects;

public class Products {

		int id;
		String name;

		public Products(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public String toString() {
			return id + " " + name;

		}
}

