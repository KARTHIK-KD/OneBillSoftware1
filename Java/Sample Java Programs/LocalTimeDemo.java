package sampe;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalTime specificTime=LocalTime.of(2, 13);
		System.out.println(specificTime);
		
		LocalTime zone=LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zone);
	}

}
