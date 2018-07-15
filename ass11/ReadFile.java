package ass11;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class ReadFile {
	
	private Scanner x;
	
	public void openFile(){ // method to open file
		try{
			x = new Scanner(new File("Gboy.docx"));
		}catch(Exception e){
			System.out.println("Could not find file");
		}
	}
	public void readFile(){ // open to read file
		
		while(x.hasNext()){ // in the text is an array we reading 
			String a = x.next();
			String b = x.next();
			String c = x.next();
			System.out.printf("\n%s %s %s", a, b, c);
		}
	}
	public void closeFile(){
		x.close();
	}

	public static void main(String[] args) {
	
		ReadFile r = new ReadFile();
		r.openFile();
		r.readFile();
		r.closeFile();
		

	}

}
