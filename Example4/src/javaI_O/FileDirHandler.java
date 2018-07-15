package javaI_O;

import java.io.*;


public class FileDirHandler {

	public static void main(String[] args) {
		try {
			// Here we instantiate class File and initialize it
			// with the first command-line argument
			File file = new File(args[0]);
			
			File[] files = file.listFiles();

			if (files == null) {

				System.out.println("Invalid path " + args[0]);
				return;

			}

			for (File f : files) {
				if (f.isFile())
					System.out.println(f.getName() + " -- > " + f.length());
				else
					System.out.println(f.getName() + " is a directoy.");

			}

			// Here we set the destination directory under the directory, which
			// was given as the first argument
			File dirObj = new File(args[0] + File.separator + args[1]);

			if (!dirObj.exists()) {
				// Here we call method mkdir()
				if (dirObj.mkdir()) {
					System.out.println(dirObj.getAbsolutePath() + " created.");
					System.out.println(dirObj.getAbsolutePath() + " exists? "
							+ file.exists());
				} else {
					// If method mkdir() was not able to create
					// the directory, we call method mkdirs() to create the
					// directory path
					dirObj.mkdirs();
					System.out.println(dirObj.getAbsolutePath() + " created.");
					System.out.println(dirObj.getAbsolutePath() + " exists? "
							+ file.exists());
				}

			}

		} catch (Exception e) {
			System.out.println("java MakeDirDemo dir_or_dir_path");
		}
	}
}

