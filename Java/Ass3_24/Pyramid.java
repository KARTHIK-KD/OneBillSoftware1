import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print((i+1)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
		scan.close();
	}

}
