package ass12;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
// returning the info in an array 
public class FlightInfo {
	
	
	public static void main(String[] args) throws NoSuchElementException{
		//String text = readString();
		//System.out.println(text);
		String[]words = readArray("Gold");
				for(int i= 0;i<words.length;i++){
					System.out.println(words[i]);
				}
				System.out.println(Arrays.toString(words));
	}
	public static String readString(String file){
		String text = "";
		try{
			Scanner s = new Scanner(new File(file));
			
			while(s.hasNextLine()){
				text = text + s.next() + " ";
			}
		
		}catch(FileNotFoundException e){
			System.out.println("File not found ");
		}
		catch(NullPointerException e){
			System.out.println("Null pointer exception");
		}
		return text;
			
		}
	// creating a method to take in a string parameter rep the name the name of the file
	// copy the contents into an array of strings 
	// the size need not to be known in advance
public static String[] readArray(String file){
	// using scanner obj to count the elements in the array
	// using the 2nd scanner to create and copy the elements in 
	int count = 0;
	try{
		Scanner s1 = new Scanner(new File(file));
		while(s1.hasNextLine()){ // counts how many lines 
			count = count + 1;
			s1.next();
			
		}
		String [] words = new String[count];		// create an array based on the counted lines		
		Scanner s2 = new Scanner(new File(file));	// and copy the elements in the array
		for(int i=0;i<count; i++){
			
			words[i] = s2.next();
		}
		return words;
	}catch(FileNotFoundException e){
		
	}
	return null;
}

}
