
class Exception1{
	static void method() {
		int[] number=new int[4];
		number[5]=8;
	}
	
}

public class TryCatch {
	public static void main(String[] args) {
		
		try {
			Exception1.method();
		}
		catch(Exception e) {
			System.err.println("Index Out of Bound");
		}
		System.out.println("other line also executed");
	}

}
