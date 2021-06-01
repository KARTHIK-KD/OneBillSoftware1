package sampe;

class Inner{
	class Outer{
		public void show() {
			System.out.println("Nessted class");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Inner.Outer obj=new Inner().new Outer();
		obj.show();
		
	}

}
