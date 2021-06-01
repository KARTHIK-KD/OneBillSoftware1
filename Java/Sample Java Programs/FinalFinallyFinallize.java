
public class FinalFinallyFinallize {
	public static void main(String[] args) {
		final int a=10;//final keyword
		try {
			int b=a/10;
			System.out.println(b);
		}catch(Exception e) {
			System.out.println(e);
		}finally { //finally keyword
			System.out.println("finally block Executed");
		}
	}

}
