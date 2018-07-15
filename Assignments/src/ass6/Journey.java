package ass6;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

public class Journey extends Car {
	private double distance;
	private double jc;
	/*private double cp;
	private double ccp;
	private double dc;*/
	

	public Journey() {
		super();
		this.distance = 0.0;
		this.jc = 1.6;
	}

	public Journey(double pchk, double as, double distance, double jc) {
		super(pchk, as);
		this.distance = distance;
		this.jc = jc;
	}

	public double computeConsumedPetrol() {

		return (1 - ((as - 50) / 500)) * pchk * distance / 100;
		//return cp;
	}

	public double computeConsumedPetrolCost() {
		return computeConsumedPetrol() * 1.12;
		//return ccp;
	}
	public double computeDriveCost(){
		return computeConsumedPetrolCost()*0.24*jc;
		//return dc;
	}
	public String toString(){
		
		
		
		DecimalFormat deciFormat = new DecimalFormat("0.00");
		return super.toString() + "Consumed Petrol :"+ deciFormat.format(computeConsumedPetrol())+"Liters" +" " +" Consumed Petrol cost :"+ deciFormat.format(computeConsumedPetrolCost()) + " Euro " +" "+ "Drive cost :"+ deciFormat.format(computeDriveCost()) +":"+  " Euro";
		
	}
}
