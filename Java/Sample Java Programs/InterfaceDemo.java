package sampe;

interface MyInterface{
	void My1();
	void My2();
}

public class InterfaceDemo implements MyInterface {
	public static void main(String[] args) {
		MyInterface obj=new InterfaceDemo();
		obj.My1();
		obj.My2();
		
	}

	@Override
	public void My1() {
		// TODO Auto-generated method stub
		System.out.println("My1");
		
	}

	@Override
	public void My2() {
		// TODO Auto-generated method stub
		System.out.println("My2");
		
	}

}
