import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int temp;
		int[] values= {4,2,6,8,7,5,1};
		Scanner scan=new Scanner(System.in);
		System.out.println("Before Sort ");
		for(int x:values)
			System.out.print(x+" ");
		
		for(int i=0;i<values.length-1;i++) {
			for(int j=i+1;j<values.length;j++) {
				if(values[i]>values[j]) {
					temp=values[i];
					values[i]=values[j];
					values[j]=temp;
				}
			}
		}
		
		System.out.println("\nAfter Sort ");
		for(int x:values)
			System.out.print(x+" ");
		scan.close();
	}

}
