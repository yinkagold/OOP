package overrideMethod;

public class Rectangle extends Shape{
	public Rectangle (double dim1, double dim2) {
	     super(dim1, dim2);
	    }
	 

	//Here we override the method area(), which has
	//been inherited from class Shape.
	//Notice that the signature and the number of parameters
	//are exactly the same. But the content is different!
	 public String area() {
	  return "Area of rectangle (" + this.dim1 + " " + this.dim2 + ") is: " + (dim1 * dim2);
	  }
}
