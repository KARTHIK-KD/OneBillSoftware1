import java.util.Scanner;

public class RevereseArray {
	public static void main(String[] args) {
		int[] values= {1,2,3,4,5,6,7};
		Scanner scan=new Scanner(System.in);
		System.out.println("Before Reverese ");
		for(int x:values)
			System.out.print(x+" ");
		
		System.out.println("\nAfter Reverse ");
		for(int i=values.length-1;i>=0;i--) {
			System.out.print(values[i]+" ");
		}
		scan.close();
	}

}
