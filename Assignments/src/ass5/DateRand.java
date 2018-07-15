package ass5;

import java.util.Random;
import java.util.Date;

public class DateRand {
	public static void main(String args[]) {

		if (args.length < 1) {
			System.out.println("Only positive integer is allowed!");

			return;

		}

		int numberOfDates = Integer.parseInt(args[0]);
		Date[] dates = new Date[numberOfDates];

		Random random = new Random();
		int limit = 100000000;
		int lower = 1000000;
		Date now = new Date();
		long nowMillisec = now.getTime();
		long tempMilliSec;
		int sign;
		for (int i = 0; i < dates.length; i++) {
			tempMilliSec = lower + random.nextInt(limit - (lower * lower))
					* random.nextInt(limit - lower);
			sign = random.nextInt(2);
			dates[i] = new Date((long) (nowMillisec + Math.pow(-1.0, sign)
					* tempMilliSec));

		}

		for (Date date : dates) {

			if (date.equals(now))
				System.out.println(date + " equals to " + now);
			else if (date.after(now))
				System.out.println(date + " is after " + now);
			else
				System.out.println(date + " is before " + now);

		}

	}

}
