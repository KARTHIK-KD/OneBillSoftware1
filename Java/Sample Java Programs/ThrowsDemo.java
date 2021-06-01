
class ThrowsExample{
	int division(int num,int den) throws ArithmeticException {
		System.out.println(num/den);
		return 0;
	}
}

public class ThrowsDemo {
	public static void main(String[] args) {
		ThrowsExample obj=new ThrowsExample();
		obj.division(10, 20);
	}

}
