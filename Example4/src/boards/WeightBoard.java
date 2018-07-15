package boards;

public class WeightBoard extends Board {

	protected double weight;

	// Here we define constructor used for cloning
	public WeightBoard(WeightBoard ob) {

		// Here we have to call super() to initialize private
		// variables in the superclass.
		super(ob);
		weight = ob.weight;
	}

	public WeightBoard(double w, double l, double we) {

		// Here we have to call super() to initialize private
		// variables in the superclass.
		super(w, l);
		weight = we;
	}

	public WeightBoard(double w, double we) {

		// Here we have to call super() to initialize private
		// variables in the superclass.
		super(w);
		weight = we;
	}

	public WeightBoard() {

		// Here we have to call super() to initialize private
		// variables in the superclass.
		super();
		weight = 0;
	}

	// Here we define method weightPSM(), which returns weight per square meter
	public double weightPSM() {
		// Here we call method area(), which is inherited from class Rect

		if (weight != 0)
			return area() / weight;
		else
			return 0.0;
	}

}
