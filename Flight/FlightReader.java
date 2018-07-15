package Flight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FlightReader {
	
	private String id;
	private String date;
	private String time;
	private String origin;
	private String destination;
	private double duration ;
	private double price;
	
	public static void main(String args[]) throws IOException,ArrayIndexOutOfBoundsException {
		// The name of the file to open.
		String fileName = "C:/Flight/Flight.txt";
		FlightWriter data = new FlightWriter(fileName, true);
		data.WriteToFlight(args[0]);

		// This will reference one line at a time
		String line = null;

		try {
			/*Scanner input = new Scanner(System.in);
			*/
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException e) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please write to File !" + fileName + " ");
			
		}
		
	}

}
