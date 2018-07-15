package overrideMethod;

public class Triangle extends Shape{
public Triangle(double dm1,double dm2){
	super(dm2, dm2);
}

		//Here we override the method area(), which has
		//been inherited from class Shape.
		//Notice that the signature and the number of parameters
		//are exactly the same. But the content is different!
		 public  String area() {
			 return "Area of triangle (" + this.dim1 + " " + this.dim2 + ") is: " + ((dim1 * dim2)/2.0);
		 }
}
