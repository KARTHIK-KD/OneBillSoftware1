import java.util.Scanner;

public class SecondSmallSecondLarge {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size,i;
		System.out.print("Enter the number of elements : ");
		size=scan.nextInt();
		int[] values=new int[size];
		System.out.println("Enter the elements one by one : ");
		for(i=0;i<size;i++) {
			values[i]=scan.nextInt();
		}
		int temp;
		for(i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(values[i]>values[j]) {					
					temp=values[i];
					values[i]=values[j];
					values[j]=temp;
				}
			}
		}
		System.out.println("Second Smallest Elements is "+values[1]);
		System.out.println("Second largest Elements is  "+values[size-2]);
		scan.close();
	}

}
