import java.util.Scanner;
class Factorial{
public int fact(int n) {
	if(n==0)
		return 1;
	else
		return n*fact(n-1);
}
}

public class pascale {

	public static void main(String[] args) {
		int n,no=0;
		Scanner sc = new Scanner(System.in);
		Factorial f = new Factorial();
		System.out.println("Enter the Number : ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
		  for(int j=0;j<n-i;j++) {
			  System.out.print(" ");
		  }
		  for(int j=0;j<=i;j++) {
			  System.out.print(" "+(f.fact(i))/(f.fact(i-j)*(f.fact(j))));
		  }
		  System.out.println();
		}
	}

}