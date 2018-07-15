package boards;

public class Board {

	protected double width;
	protected double length;

	// This constructor is used for making clones.
	public Board(Board ob) {
		width = ob.width;
		length = ob.length;
	}

	public Board(double w, double l) {
		width = w;
		length = l;
	}

	public Board(double w) {
		width = length = w;
	}

	public Board() {
		width = 0;
		length = 0;
	}

	// Here we define comapre() method, which compares two objects
	// of class Board with each other
	public boolean compare(Board rob) {
		if (this.width == rob.width && this.length == rob.length)
			return true;
		else
			return false;
	}

	// Here we define method area(), which returns the area of the
	// board.
	public double area() {
		return width * length;
	}
}
