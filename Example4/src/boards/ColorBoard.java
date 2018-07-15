package boards;

public class ColorBoard extends WeightBoard {
	protected String color;

	public ColorBoard(ColorBoard ob) {
		super(ob);
		color = ob.color;
	}

	public ColorBoard(double w, double l, double we, String c) {
		super(w, l, we);
		color = c;
	}

	public ColorBoard(double w, double we, String c) {
		super(w, we);
		color = c;
	}

	public ColorBoard() {
		super();
		color = "No color";
	}

	// Here we define method compare, which compares the object passed as
	// argument (the called object) with the calling object and returns a
	// boolean
	// value, which indicates whether objects are equal or not
	public boolean compare(ColorBoard rwob) {

		if (super.compare(rwob) && weight == rwob.weight
				&& this.color.equals(rwob.color))

			return true;
		else
			return false;
	}

	public double getWeight() {
		return this.weight;
	}

	public String getColor() {
		return this.color;
	}

}
