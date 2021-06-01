package sampe;
import java.util.Scanner;

public class SamplePowerCalculation {
	public static void main(String[] args) {
		char defaultChar='q';
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the Character : ");
			char userChar=scan.next().charAt(0);
			if(userChar==defaultChar)
			{
				break;
			}
		}
		System.out.println("End");
		scan.close();
	}

}
