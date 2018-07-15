package ass6;

import java.text.DecimalFormat;

public class Car {
	protected double pchk;
	protected double as;
	
	public Car(){
		pchk = 0.0;
		as = 0.0;
	}
	public Car(double pchk, double as){
		this.pchk = pchk;
		this.as = as;
	}
	public String toString(){
		
		return "petrol consumption per 100 km  :" + pchk +" "+ "average speed in km/h :" + as +" ";
		
	}

}
