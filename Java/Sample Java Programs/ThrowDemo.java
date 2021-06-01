
public class ThrowDemo {
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("Age not limit");
		else
			System.out.println("Welcome");
	}
	public static void main(String[] args) {
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
	}

}
