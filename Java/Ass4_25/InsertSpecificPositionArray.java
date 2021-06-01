import java.util.Scanner;

public class InsertSpecificPositionArray {
	public static void main(String[] args) {
		int[] values= {1,2,3,4,5,6,7};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the new elements : ");
		int val=scan.nextInt();
		System.out.println("Enter the Position : ");
		int pos=scan.nextInt();
		System.out.println("Before Changes Array Values ");
		for(int x:values)
			System.out.print(x+" ");
		values[pos]=val;
		System.out.println("\nAfter changing Array Values ");
		for(int x:values)
			System.out.print(x+" ");
		scan.close();
	}

}
