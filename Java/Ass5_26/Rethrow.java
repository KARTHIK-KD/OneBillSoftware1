public class Rethrow {

	static void temp() {
		try {
			int base = 0;
			int val = 5 / base;

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			throw (e); 
		}
	}

	public static void main(String[] args) {

		try {
			temp();

		} catch (Exception e) {
			System.out.println("General Exception");
		}

	}

}