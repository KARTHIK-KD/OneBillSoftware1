package sampe;

public class StringArray {
	public static void main(String[] args) {
		String s1[]= {"this","is","a","test"};
		System.out.println("Original String");
		for(String x:s1)
			System.out.print(x+" ");
		s1[1]="was ";
		s1[3]=s1[3].concat(", too!");
		System.out.println("After changing");
		for(String x:s1)
			System.out.print(x+" ");
	}

}
