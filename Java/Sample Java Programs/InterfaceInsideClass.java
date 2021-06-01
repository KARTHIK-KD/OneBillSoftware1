package sampe;

class Test{
	interface Demo{
		void show();
	}
}

class Testing implements Test.Demo{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside Interface");
	}
	
}

public class InterfaceInsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.Demo obj=new Testing();
		obj.show();
	}

}
