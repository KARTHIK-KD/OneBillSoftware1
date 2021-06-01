
class Exception2{
	static void method() {
		int[] number=new int[4];
		number[5]=8;
	}
	
}

public class ExcDemo3 {
	public static void main(String[] args) {
		
		try {
			Exception2.method();
		}
		catch(Exception e) {
			System.err.println("Index Out of Bound");
		}
		System.out.println("other line also executed");
	}

}
