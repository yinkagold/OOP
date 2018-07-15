package overrideMethod;

public class Shape {
	protected double dim1, dim2;

	public Shape(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public String area() {
		return "The area of Shape instance is not defined!";
	}
}
