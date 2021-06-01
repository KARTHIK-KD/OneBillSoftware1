
abstract class Sample_Class{
	abstract void show();
}

public class Anomous {

	public static void main(String[] args) {
		Sample_Class c = new Sample_Class() {
			void show() {
				System.out.println("Calling");
			}
			
		};
		c.show();
		
	}

}