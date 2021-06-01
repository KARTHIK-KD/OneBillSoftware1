package sampe;

public class StringIsImmutable {
	public static void reference(String x,String y) {
		if(x==y)
			System.out.println("Same");
		else
			System.out.println("NotSame");
	}
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println("Before pointing ");
		reference(s1,s2);
		s1="ava";
		System.out.println("After pointing  ");
		reference(s1,s2);
		
	}

}
