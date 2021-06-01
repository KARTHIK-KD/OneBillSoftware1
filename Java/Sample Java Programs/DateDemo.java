package sampe;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDate somedate=LocalDate.of(2000, Month.JULY, 18);
		System.out.println(somedate);
		
		LocalDate fromzone=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(fromzone);
		
		LocalDate dateFromEpoch=LocalDate.ofEpochDay(365);
		System.out.println(dateFromEpoch);
	}

}
