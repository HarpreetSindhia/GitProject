package RevisionSelenium.RevisionSeleniumTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassConcept {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat date = new SimpleDateFormat("M/d/yyyy");
		
		System.out.println(date.format(d));
		
		SimpleDateFormat date1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(date1.format(d));
		
		
	}

}
