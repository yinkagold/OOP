package ass11;
import java.io.BufferedReader;
//Here we import File class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//text packages are necessary for formatting
import java.text.*;
//util package is necessary for getting Date class
import java.util.*;

public class FileMain{
	public static void main(String args[]) {
//The name of the file to open.
String fileName = "Gold.txt";

// This will reference one line at a time
String line = null;

try {
    // FileReader reads text files in the default encoding.
    FileReader fileReader = 
        new FileReader(fileName);

    // Always wrap FileReader in BufferedReader.
    BufferedReader bufferedReader = 
        new BufferedReader(fileReader);

    while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
    }   

    // Always close files.
    bufferedReader.close();         
}
catch(FileNotFoundException ex) {
    System.out.println(
        "Unable to open file '" + 
        fileName + "'");                
}
catch(IOException ex) {
    System.out.println(
        "Error reading file '" 
        + fileName + "'");                  
    // Or we could just do this: 
    // ex.printStackTrace();
}
}

}