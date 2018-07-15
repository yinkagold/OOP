package abstractDemo;

public class AbstracMain {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(8,6);
		Triangle triangle = new Triangle(9,5);
		// instead of having an object of the new keyword, its done as shown below
		Shape shape;
		shape = rectangle;
		System.out.println(shape.area());
		
		shape = triangle;
		System.out.println(shape.area());
		
	}

}
