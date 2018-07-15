package abstractDemo;

public class Rectangle extends Shape {
	Rectangle(double dim1, double dim2){
		super(dim1, dim2);
	}
	public String area(){
		return "The area of rectangle ("+ dim1 + "x" + dim2 + ") is :" + (dim1*dim2);
	}

}
