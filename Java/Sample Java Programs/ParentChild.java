package sampe;

class Parent{
	int width;
	int height;
	void show() {
		System.out.println("Width is "+width+" Heightis "+height);
	}
}

class Child extends Parent{
	void area() {
		System.out.println("area is "+(width*height));
	}
}

public class ParentChild {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.width=10;
		obj.height=20;
		obj.show();
		obj.area();
		
	}

}
