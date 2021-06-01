
interface A{
	default void m() {
		System.out.println("Method call in interface A");
	}
}
interface B extends A{

	@Override
	default void m() {
		System.out.println("Method call in interface B");
	}
	
}

interface C extends A{

	@Override
	default void m() {
		System.out.println("Method call in interface C");
	}
	
}

public class Diamond implements B,C {
	public static void main(String[] args) {
		Diamond obj=new Diamond();
		obj.m();
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		B.super.m();
	}
	

}
