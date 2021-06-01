
public class FinallyDemo1 {
	public static void main(String[] args) {
		
		try {
			int val=25/5;
			System.out.println(val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Divide by zero");
		}finally {
			System.out.println("this will be printed sure ");
		}
		
	}

}
