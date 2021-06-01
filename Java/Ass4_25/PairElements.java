import java.util.Scanner;

public class PairElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size,i,ele,flg=0;
		System.out.print("Enter the number of elements : ");
		size=scan.nextInt();
		int[] values=new int[size];
		System.out.println("Enter the elements one by one : ");
		for(i=0;i<size;i++) {
			values[i]=scan.nextInt();
		}
		System.out.println("Pair Elements ");
		for(i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(values[i]+values[j]==10)
					System.out.println(values[i]+" "+values[j]);
			}
		}
	}

}
