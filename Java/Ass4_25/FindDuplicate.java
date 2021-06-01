import java.util.Scanner;

public class FindDuplicate {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size;
		System.out.print("Enter the number of elements : ");
		size=scan.nextInt();
		int[] values=new int[size];
		System.out.println("Enter the elements one by one : ");
		for(int i=0;i<size;i++) {
			values[i]=scan.nextInt();
		}
		
		//find duplicate elements
		int flg=1;
		int[] dup=new int[size];
		int init_value=0;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(values[i]==values[j]) {
					if(init_value==0)
						dup[init_value++]=values[i];
					else
					{
						for(int k=0;k<init_value;k++) {
							if(dup[k]==values[i])
							{
								flg=0;
								break;
							}
						}
					}
					if(flg==1)
						dup[init_value++]=values[i];
				}
			}
			flg=1;
		}
		scan.close();
		
		System.out.println("Duplicate Elements ");
		for(int i=1;i<init_value;i++)
			System.out.println(dup[i]+" ");
	}

}
