package ass11_2;

import java.io.File;
import java.io.FileFilter;

public class FileLength implements FileFilter {



		int length;
		
		public FileLength(int suffix) {
			this.length =suffix;
		}
		
		public boolean accept(File name) {
		
			return name.length() > length;
		}
}
