
class A{
	static void m1() {
		System.out.println("calling m1");
	}
}

public class StaticKeyWord extends A {
	public static void main(String[] args) {
		m1();
	}
}
