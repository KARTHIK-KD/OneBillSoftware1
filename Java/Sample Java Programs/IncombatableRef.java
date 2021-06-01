package sampe;

class Parent1{
	int width;
	int height;
	void show() {
		System.out.println("Width is "+width+" Heightis "+height);
	}
}

class Child1 extends Parent1{
	void area() {
		System.out.println("area is "+(width*height));
	}
}

public class IncombatableRef {
	public static void main(String[] args) {
		Child1 obj1=new Child1();
		obj1.height=10;
		obj1.width=20;
		Child1 obj2;
		obj2=obj1;
		obj2.show();
	}

}
