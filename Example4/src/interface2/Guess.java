package interface2;

import java.util.Random;

public class Guess implements Quartiles {

		Random r = new Random();
		// contant variables cana be imported from the interface to be shared in the other classes
		public void toss(){
			int p = (int) (100*r.nextDouble());
			if(p<=25)
				System.out.println(p +" "+ LQ);
			else if(p>25 && p<75)
				System.out.println(p + " "+M);
			else if(p>75)
				System.out.println(p +" "+UQ);
		}
}
