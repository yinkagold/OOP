package overrideMethod;

public class Circle extends ShapeAbstract {
	double radius;

	Circle(double r) {
		radius = r;
	}
	public String area(){
		return "The area of the circle with radius " + radius + "is :" + (3.142*Math.pow(radius, 2));
	}

}
