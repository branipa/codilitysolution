import java.awt.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.TIMEOUT;

public class Problem5 {

	public static void main(String[] args) throws ParseException {

		String S = "15:15:10";
		String T = "15:15:12";

		System.out.println(Solution(S, T));

	}

	public static int Solution(String S, String T) {
		int startHrs = 0;
		int startMin = 0;
		int startSec = 0;
		int endHrs = 0;
		int endMin = 0;
		int endSec = 0;
		String hrsstring;
		String secstring;
		String minstring;
		int counter2=0;
		String[] start = S.split(":");
		String[] end = T.split(":");

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				startHrs = Integer.parseInt(start[0]);
				endHrs = Integer.parseInt(end[0]);
			}
			if (i == 1) {
				startMin = Integer.parseInt(start[1]);
				endMin = Integer.parseInt(end[1]);
			}
			if (i == 2) {
				startSec = Integer.parseInt(start[2]);
				endSec = Integer.parseInt(end[2]);
			}
		}

		int flag = 0;
		int flag1 = 0;

		for (int hrs = startHrs; hrs <= endHrs; hrs++) {

			for (int mins = 00; mins <= 59; mins++) {
				if (flag == 0) {
					mins = startMin;
					flag =1;
				}
				if (mins > endMin && hrs == endHrs)
					break;

				for (int secs = 00; secs <= 59; secs++) {

					if (flag1 == 0) {
						secs = startSec;
						flag1 = 1;
					}
					if ((secs > endSec) && (hrs == endHrs) && (mins == endMin))
						break;

					if (hrs < 10)
						hrsstring = "0" + hrs;
					else
						hrsstring = Integer.toString(hrs);
					if (mins < 10)
						minstring = "0" + mins;
					else
						minstring = Integer.toString(mins);

					if (secs < 10)
						secstring = "0" + secs;
					else
						secstring = Integer.toString(secs);

					String verifystring = hrsstring + minstring + secstring;
					System.out.println(hrsstring + ":" + minstring + ":" + secstring);
					int counter = 0;
					//char ss = verifystring.charAt(0);
					Set a = new TreeSet();
					
					for (int ii = 0; ii < 6; ii++) {
						
					//	System.out.println(ss + "  Compare to" + verifystring.charAt(ii+1));
					//	if ((ss != verifystring.charAt(ii + 1))) {
						//	System.out.println("inside");
						//	ss = verifystring.charAt(ii + 1);
						//	counter = counter + 1;
							
					//	}

						a.add(verifystring.charAt(ii));
					}

					System.out.println(a.size());
					
					if (counter < 1)
						counter2=counter2+1;
				}
			}

		}

		return counter2;

	}

}
