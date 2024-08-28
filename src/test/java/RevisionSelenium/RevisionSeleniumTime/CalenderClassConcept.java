package RevisionSelenium.RevisionSeleniumTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClassConcept {
	
	public static void main(String[] args) {
		
		
		Calendar calen = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(calen.getTime()));
		
		System.out.println(calen.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(calen.get(Calendar.AM_PM));
		
		System.out.println(calen.get(Calendar.DAY_OF_WEEK));
	}

}
