package interface3;
import java.util.Date;
import java.text.SimpleDateFormat;
// first interface
public interface InitialRegistry {
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
	
	String date = sdf.format(new Date());
	boolean updateGrade(String name, int grade);
}
