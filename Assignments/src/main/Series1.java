package main;

public class Series1 {

	public static void main(String[] args) {
		
		int a0,a1,a2;
		
		a0 = 0;
		a1 = 1;
		a2 = a0 + a1;
		
		System.out.print(a1);
		
		for(int i=1;i<10;i++){
			
			System.out.print(" "+a2);
			
			a0 = a1;
			a1 = a2;
			a2 = a0 + a1;
		}
		
		int b0,b1,b2,b3,i;
		b0 = 0;
		b1 = 0;
		b2 = 1;
		b3 = b0 + b1 + b2;
		
		System.out.print("\n"+b2);
		
		for(i = 3;i<10;i++){
			
			System.out.print(" "+b3);
			
			b0 = b1;
			b1 = b2;
			b2 = b3;
			b3 = b0 + b1 + b2;
		}
		

	}

}
