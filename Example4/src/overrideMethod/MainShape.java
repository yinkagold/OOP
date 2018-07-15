package overrideMethod;

public class MainShape {

	public static void main(String[] args) {
		System.out.println("Compile-time polymorphism:");
		 
		  //Here we define an object of Shape class.
		  Shape shape = new Shape (10, 14);
		  
		  //Here we print the area of shape object.
		  System.out.println(shape.area());
		 
		  //Here we define an object of Rectangle class.
		  Rectangle rectangle = new Rectangle (8, 6);
		  
		  //Here we print the area of rectangle object.
		  System.out.println(rectangle.area());
		  
		  
		 //Here we define an object of Triangle class.
		  Triangle triangle = new Triangle (9, 5);

		//Here we print the area of rectangle object.
		  System.out.println(triangle.area());
		  

		 
		  System.out.println("----------------");
		  System.out.println("Run-time polymorphism:");
		  
		  //Here we initialize the shape object with rectangle object.
		   shape = rectangle;
		  
		  //In the followings we use run-time polymorphism.
		  
		 //Here we use run-time polymorphism to print
		  //the area of rectangle object.
		  System.out.println(shape.area());

		  
		  //Here we initialize the shape object with triangle object.
		  shape = triangle;

		  //Here we use run-time polymorphism to print
		  //the area of triangle object.
		  System.out.println(shape.area());
		  

	}

}
