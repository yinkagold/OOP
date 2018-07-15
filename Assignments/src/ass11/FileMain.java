package ass11;

import java.io.File;
//text packages are necessary for formatting
import java.text.*;
//util package is necessary for getting Date class
import java.util.*;

//This is the main class
public class FileMain {

	// Here we define static method show(), which will
	// be called from staic method main()
	static void show(String str) {
		System.out.println(str);
	}

	public static void main(String args[]) {

		try {

			File file = new File(args[0]);

			show("Name: " + file.getName());

			show("File length: " + file.length());

			Date date = new Date(file.lastModified());

			SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy kk:mm:ss");

			show("Last modified: " + sdf.format(date));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("The program requires the name of a file as an argument:");
			System.out.println("Usage: java fileDemo file_name");
		}
	}
}