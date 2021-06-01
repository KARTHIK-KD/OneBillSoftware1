package sampe;

import java.sql.Date;

interface Demo{
	int process();//abstract method
	static Date NowDate() {
		return new Date(10);
	}
	default String dateFromate(Date date) {
		return date.toString();
	}
}

public class LamdaDateDemo {
	public static void main(String[] args) {
		Demo ref = () -> 100; // abstract method calling
		System.out.println(ref.process());
		Demo.NowDate();
	}
}
