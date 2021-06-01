import java.util.Scanner;

public class FloydTraingle {
	public static void main(String[] args) {
		int val=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(++val+" ");
				}
				else
				{
					break;
				}
			}
			System.out.println("\n");
		}
		scan.close();
	}

}
