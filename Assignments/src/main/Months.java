package main;

public class Months {

	public static void main(String[] args) {
		String [] month = new String[] {"January","Feb", "March", "April","May","June","July","August","Sept","Oct","november","December"};
		
		int days [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0;i<12;i++){
			
			switch(days[i]){
				
			case 30:
				System.out.println(month[i]+" ");
				break;
				
			}
			
		}
	}

}
