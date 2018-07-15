package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x,y,div;
		try {
			// x=2;y = Integer.parseInt(args[0]); // suppose we want to supply a cmd line arg
			 x = 2; y = 3;
			 div = x / (3 - y);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // prints a built in default msg
			e.getStackTrace();
			System.out.println("A division by zero error !");
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("enter a numeric value !");
		
		}finally {
			x = 0; y=0; div=0;
			System.out.println("End of the program !");
		}

	}

}
