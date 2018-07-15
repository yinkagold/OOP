package ass12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FlightWriter {
	
	private String path; // an instance variable which is the name and location of  
	// of the file 
	private boolean append_to_file = false; // // by default is false which means you dont want
	// to append but erase all i the file
	
	public FlightWriter(String file_path){
		path = file_path;
	}
	public FlightWriter(String file_path,boolean append_value){ // tis constructor helps us append
		// a new value when creating a new object
		path = file_path;
		append_to_file = append_value;
	}
	public void WriteToFlight(String textLine) throws IOException{
		FileWriter write =  new FileWriter(path, append_to_file);// helps to open the correct file
		// and storing the texts as bytes
		
		PrintWriter print_line = new PrintWriter(write);
		print_line.printf("%s" + "%n", textLine);
		print_line.close();
	}
	
}