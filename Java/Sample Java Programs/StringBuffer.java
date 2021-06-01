package sampe;

public class StringBuffer {
	public static void concate(String s1) {
		s1=s1+" fresher";
	}
	public static void concate2(StringBuilder s2) {
		s2.append(" fresher");
	}
	/*
	 * public static void concate3(StringBuffer s2) { s2.append(" fresher"); }
	 */
	
	
	public static void main(String[] args) {
		String s1=new String("Karthik");
		concate(s1);
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("karthik");
		concate2(s2);
		System.out.println(s2);
		
	}
}
