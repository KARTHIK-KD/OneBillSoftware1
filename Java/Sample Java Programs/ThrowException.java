
public class ThrowException {
	public static void main(String[] args) {
		try {
			System.out.println("coding....");
			throw new ArithmeticException();//manually calling error exception
			
		}catch(Exception e) {
			System.out.println("Divide by zero");
		}
		System.out.println("other code");
	}
}
