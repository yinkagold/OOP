package ass11_3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RecursiveList {
	// to access everything below a certain directory including all subdirectories and their files,
	//not just the immediate level of files

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//String dir = input.nextLine();
		System.out.println("Enter directory name: ");
		File dirSubdir = new File(input.nextLine()); // here we specify the directory
		displayDirectoryContents(dirSubdir);
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
