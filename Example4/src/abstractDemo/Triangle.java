package abstractDemo;

public class Triangle extends Shape {
Triangle(double dim1, double dim2){
	super(dim1, dim2);
}
public String area(){
	return "The area of rectangle ("+ dim1 + "x" + dim2 + ") is :" + ((dim1*dim2)/2.0);
}
}
