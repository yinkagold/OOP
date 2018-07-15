package javaI_O;

//Here we import File class
import java.io.File;
//text packages are necessary for formatting
import java.text.*;
//util package is necessary for getting Date class
import java.util.*;

//This is the main class
public class FileDemo {

	// Here we define static method show(), which will
	// be called from staic method main()
	static void show(String str) {
		System.out.println(str);
	}

	public static void main(String args[]) {

		// Here we create an object of class File
		// and catch the exception if the user forgets to give
		// an argument to the program
		try {

			File file = new File(args[0]);

			// Here we call different methods of class File to get
			// various information about the File object
			show("Name: " + file.getName());
			show("Path: " + file.getPath());
			show("Absolute path: " + file.getAbsolutePath());
			show("Parent: " + file.getParent());
			show("The file exists? " + file.exists());
			show("The file is writeable? " + file.canWrite());
			show("The file is readable? " + file.canRead());
			show("Is it a file? " + file.isFile());
			show("Is it a directory? " + file.isDirectory());
			show("Is it absolute?" + file.isAbsolute());
			show("File length: " + file.length());

			// Here we instantiate class Date and initialized
			// with the file last modification date
			Date date = new Date(file.lastModified());

			// lastModified() method returns a long integer, which must
			// be converted to a readable date format. Therefore,
			// we use SimpleDateFormat to define a format for
			// printing out the file modification date
			// Here we say that we want the modification time like this:
			// 24:11:2004 14:39:43

			SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy kk:mm:ss");

			// Here we convert the modification date to a string by using
			// sdf.format() and
			// pass it to method show() for printing.
			show("Last modified: " + sdf.format(date));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("The program requires the name of a file as an argument:");
			System.out.println("Usage: java fileDemo file_name");
		}
	}
}