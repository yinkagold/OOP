package ass11_2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class MainFile {

	public static void main(String[] args) {

		try {
			File destinationDir = new File(args[0]);
			FilenameFilter file = new FileName(args[1]);
			FileFilter fileLength = new FileLength(
					Integer.parseInt(args[2]));

			if (destinationDir.isDirectory()) {
				String s[] = destinationDir.list(file);
				for (int i = 0; i < s.length; i++) {
					System.out.println(s[i]);
				}

			

				File[] fL = destinationDir.listFiles(fileLength);
				for (int i = 0; i < fL.length; i++) {

					System.out.println(fL[i]);
				}

			} else
				System.out.println(args[0] + "is not a directory.");

		} catch (Exception e) {
			System.out.println("Usage: java listDir dir_name a_sufix_like_txt");
		}

	}
}
