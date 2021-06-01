package sampe;

public class StringConvertDemo {
	public static void main(String[] args) {
		String s="OneBill";
		
		//converting string to string buffer
		//StringBuffer sbr=new StringBuffer(s);
		//sbr.reverse();
		
		//Convert String to String Builder
		StringBuilder sbr=new StringBuilder(s);
		sbr.reverse();
		System.out.println(sbr);
		
		//
		
	}

}
