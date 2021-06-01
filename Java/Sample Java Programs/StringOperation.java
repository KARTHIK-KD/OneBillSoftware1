package sampe;

public class StringOperation {
	public static void main(String[] args) {
		String s1="karthik";
		String s2="mani";
		System.out.println("Length : "+s1.length());
		
		System.out.println("Equals : "+s1.equals(s2));
		
		System.out.println("Char Position : "+s1.charAt(5));
		
		System.out.println("Indexof : "+s1.indexOf("ar"));
		
		System.out.println("Concat : "+s1.concat(s2));
		
		System.out.println("SusString : "+s1.substring(2, 5));
	}

}
