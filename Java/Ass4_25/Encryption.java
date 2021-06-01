import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
				System.out.print(" ");
			else
				System.out.print(str.indexOf(c)+1);
			
		}
		scan.close();
	}

}
