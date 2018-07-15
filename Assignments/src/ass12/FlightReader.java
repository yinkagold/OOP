package ass12;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightReader {


	
	public static void main(String args[]) throws IOException {
		// The name of the file to open.
		String fileName = "U:/Flight/FlightInformation.txt";
		FlightWriter data = new FlightWriter(fileName, true);
		data.WriteToFlight(args[0]);

		// This will reference one line at a time
		String line = null;

		try {
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
