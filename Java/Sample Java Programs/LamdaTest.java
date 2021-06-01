package sampe;

interface FunctionalInt{
	void abstractMethosDemo(int x);
	
	default void normal() {
		System.out.println("hello normal method");
	}
	static void staticMethod() {
		System.out.println("Static Method ");
	}
}

public class LamdaTest {
	public static void main(String[] args) {
		FunctionalInt ref=new FunctionalInt() {

			@Override
			public void abstractMethosDemo(int x) {
				System.out.println("hai");
				
			}
			
		};
		ref.abstractMethosDemo(10);
		ref.normal();
		FunctionalInt.staticMethod();
		
	}

}
