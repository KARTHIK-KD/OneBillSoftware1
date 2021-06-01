
public class TruthTable {
	public static void main(String[] args) {
		int A=0,B=0;
		System.out.println("A\tB\tA&B\tA|B\tA^B");
		for(int i=0;i<4;i++)
		{
			System.out.print((A==0)?"F\t":"T\t");
			System.out.print((B==0)?"F\t":"T\t");
			System.out.print(((A&B)==0)?" F\t":" T\t");
			System.out.print(((A|B)==0)?" F\t":" T\t");
			System.out.println(((A^B)==0)?" T":" F");
			if(i==1)
				A=1;
			B=(i+1)%2;
		}
	}

}
