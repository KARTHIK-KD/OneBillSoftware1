package sampe;

interface Outer{
	interface Inner{
		void innerShow();
	}
	void outerShow();
}

class T implements Outer,Outer.Inner{

	@Override
	public void innerShow() {
		// TODO Auto-generated method stub
		System.out.println("Inner");
		
	}

	@Override
	public void outerShow() {
		// TODO Auto-generated method stub
		System.out.println("Outer");
		
	}

}

public class InterfaceInsideInterfce {
	public static void main(String[] args) {
		T obj=new T();
		obj.innerShow();
		obj.outerShow();
	}

}
