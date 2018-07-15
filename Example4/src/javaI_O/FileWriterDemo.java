package javaI_O;
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) {
		
			String fileName = "temp/registry.txt";
			// Here we define string text
			String text = "Please pay attention, that we are now studying"
					+ " file handling techniques in Java...";
			// Here we create an array of characters with the size of string text
			char buffer[] = new char[text.length()];
			// Here we use method getChars() of class String to
			// decompose string text to characters and initialize array buffer
			// with them
			text.getChars(0, text.length(), buffer, 0);
			FileWriter fileWriter = null;
			// Here we instantiate FileWriter and initialize it with the
			// first argument
			
			BufferedReader reader=null;
			try {
				fileWriter = new FileWriter(fileName, true);
				
			// Here we write the whole text string to the file.
			fileWriter.write(text);
			// Here we write line break to the file.
			fileWriter.write("\r\n");
			// In the following we write the content of buffer array
			// to the file so that during write operation we replace
			// each space with underscore in the file.
			for (int i = 0; i < buffer.length; i++) {
				if (buffer[i] == ' ')
					fileWriter.write('_');
				else
					fileWriter.write(buffer[i]);
			}
			fileWriter.write("\r\n");
			// Here we write the whole character array to the file.
			fileWriter.write(buffer);
			// Here we close the file writing stream.
			fileWriter.close();
			// Here we use a BufferedWriter to append data to the end of the file.
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
			writer.write(text);
			writer.close();
			 reader = new BufferedReader(new FileReader(fileName));
			System.out.println("The current content of " + fileName + ":");
			String line;
			while ((line = reader.readLine()) != null)
				System.out.println(line);
			
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("The file could not be read!");
			}
		}
		
	}
	}

