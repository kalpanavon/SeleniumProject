package sessionthree;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
			printSystemDate();
	}
	public static void printSystemDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy HHmmss");//date in ddMMYY format and time with out colon
		Date d = new Date();
		System.out.println(d);
		String date = sdf.format(new Date()); 
		System.out.println(date); 
	}
}
