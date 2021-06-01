import java.util.Scanner;

public class FindSubstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s1=scan.next();
		System.out.print("Enter the SubString : ");
		String s2=scan.next();
		
		int s1Len=s1.length();
		int s2Len=s2.length();
		int c=0;
		for(int i=0;i<s1Len;i++) {
			for(int j=0;i<s2Len;j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					c++;
					if(c==s2Len) {
						System.out.println("present");
						break;
					}
				}
				else
				{
					break;
				}
			}
			c=0;
		}
		if(c==0)
			System.out.println("Not Present");
		
		scan.close();
	}

}
