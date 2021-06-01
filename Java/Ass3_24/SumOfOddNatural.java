import java.util.Scanner;

public class SumOfOddNatural {
	public static void main(String[] args) {
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(i%2==1)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		scan.close();
	}

}
