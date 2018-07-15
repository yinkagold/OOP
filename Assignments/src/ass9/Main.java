package ass9;

import java.nio.channels.MembershipKey;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Member[] member = new Member[3];
		// initializing the array with different type of objects
		member[0] = new Member("John", "15/04/2015", 26.5);
		member[1] = new Member("Peter", "15/04/2013", 45.7);
		member[2] = new Member("Paul", "15/04/2014", 22.5);

		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].toString());
		}
		/*for(int i =0;i<member.length;i++)
		System.out.println(member[i].search("Paul", 22.5));*/
	}
}
