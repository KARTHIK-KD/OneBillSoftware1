import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number :");
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.println((i*i*i));
		}
		scan.close();
	}

}
