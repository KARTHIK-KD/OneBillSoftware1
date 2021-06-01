
class CustomException extends Throwable{
	public CustomException(String str) {
		super(str);
		System.out.println(str);
	}
}

public class bank {
	public static void main(String[] args) {
		
		try {
			throw new CustomException("Karthik");
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
