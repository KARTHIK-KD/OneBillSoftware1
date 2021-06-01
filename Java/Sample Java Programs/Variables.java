package sampe;

class ReferenceDemo{
	int value=10;//instance variable
	int display()
	{
		double salary=10.0;//Local Variable
		System.out.println(" Value : "+value);
		return 0;
	}
}
public class Variables {
	public static void main(String[] args) {
		ReferenceDemo demo=new ReferenceDemo();//demo obj is a reference
		System.out.println(demo);
		System.out.println(demo.display());
		
		
	}

}
