package main;

public class Array {

	public static void main(String[] args) {
		
		System.out.println("The list of arguments: ");
		
		for(int i = 0;i<args.length;i++)
			System.out.print(args[i]+" ");
		
			System.out.println();
		
			int[] numbers = null;
		
		numbers = new int[5]; // size of the array must be defined 
		
		String[] weekDays = new String[]{"Mon","Tue","Wed","Thur","Fri"};
		
		System.out.println("The length of numbers is " + numbers.length);
		
		System.out.println("The length of weekDays is "+ weekDays.length );
		
		// here we initialize the arrays 
		
		for(int i = 0; i<numbers.length;i++)
			numbers[i]=(i);
		
	
		// here we print the content of arrays
		
		int counter; // now it is declared as a global variable so it can't be redeclared but it can be re used 
		for(counter = 0; counter<numbers.length;counter++){
			//if(numbers[counter]>=7)
				if(numbers[counter]!=0)
			System.out.print(numbers[counter]+" ");
		}
		
		System.out.println();
		
		for(counter = 0 ;counter<weekDays.length; counter++){
			
			switch(weekDays[counter]){
			
			case "Mon":
			case "Tue":
				System.out.println(weekDays[counter]+" is the beginning of the week!");
				break;
			case "wed":
				System.out.println(weekDays[counter]+ " is the middle of the week!");
				break;
			default:
				System.out.println(weekDays[counter]+" is another thing!");
			
			}
			
		}
		// the variable counter can be used again cos it is only valid in the for loop alone and can be declared again 
		
	}

}
