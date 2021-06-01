import java.util.Scanner;

public class ElementPresentOrNot {
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
		System.out.println("Enter the Search Elements : ");
		ele=scan.nextInt();
		for(i=0;i<size;i++) {
			if(values[i]==ele)
			{
				System.out.println("Element is present");
				flg=1;
				break;
			}
		}
		if(flg==0)
			System.out.println("Element is Not present");
		scan.close();
	}

}
