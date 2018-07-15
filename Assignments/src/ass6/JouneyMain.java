package ass6;
import java.util.*;
import ass6.Journey;
import ass6.Car;

public class JouneyMain {
	public static void main(String[] args){
		Journey [] journey = new Journey[5];
		journey[0] = new Journey();
		journey[1] = new Journey(4.8,120,80,1.6);
		journey[2]= new Journey(3.6,100,75,1.2);
		journey[3] = new Journey(2.4,120,77,1.4);
		journey[4] = new Journey(2.7,160,90,1.6);
		
		
		
		for(int i=0;i<journey.length;i++){
			
			System.out.printf( "Consumed Petrol :" +"%.2f \n" , journey[i].computeConsumedPetrol());
			System.out.printf("Consumed Petrol Cost :" +"%.2f \n", journey[i].computeConsumedPetrolCost());
			System.out.printf("Drive Cost :" + "%.2f \n" , journey[i].computeDriveCost());
			System.out.println(journey[i]);
		}
	}
	

}
