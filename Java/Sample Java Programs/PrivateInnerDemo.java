package sampe;

class Outer1{
	private class Inner{
		void print() {
			System.out.println("display");
		}
	}
	void display()
	{
		Inner i=new Inner();
		i.print();
	}
}

public class PrivateInnerDemo {
	public static void main(String[] args) {
		Outer1 obj=new Outer1();
		obj.display();
	}

}
