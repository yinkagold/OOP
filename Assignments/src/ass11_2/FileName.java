package ass11_2;

import java.io.File;
import java.io.FilenameFilter;

public class FileName implements FilenameFilter {
	String suffix;

	public FileName(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {

		return name.endsWith(suffix);
	}

}
