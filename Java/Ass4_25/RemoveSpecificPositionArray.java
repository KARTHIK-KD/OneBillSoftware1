import java.util.Scanner;

public class RemoveSpecificPositionArray {
	public static void main(String[] args) {
		int[] values= {1,2,3,4,5,6,7};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Remove Element Position : ");
		int pos=scan.nextInt();
		System.out.println("Before Changes Array Values ");
		for(int x:values)
			System.out.print(x+" ");
		System.out.println("\nAfter changing Array Values ");
		for(int i=0;i<values.length-1;i++)
		{
			if(pos<=i) {
				values[i]=values[i+1];
				System.out.print(values[i]+" ");
			}
			else
				System.out.print(values[i]+" ");
		}
		scan.close();
	}

}
