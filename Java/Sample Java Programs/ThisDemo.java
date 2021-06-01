package sampe;

import java.util.Scanner;

class Box {
	int weight,height,breath;
	public Box() {// No Arguments
		this.weight=10;
		this.height=10;
		this.breath=10;
	}
	public Box(int weight) {//1 Arguments
		this();
		this.weight= weight;
	}
	public Box(int weight,int height) {//2 Arguments
		this();
		this.weight= weight;
		this.height = height;
	}
	
	public Box(int weight,int height,int breath) {//3 Arguments
		this.weight= weight;
		this.height = height;
		this.breath = breath;
	}
	int volumn() {
		return weight*height*breath;
	}
	
}

public class ThisDemo {
	public static void main(String[] args) {
		int w,h,b;
		Scanner scan=new Scanner(System.in);
		Box b1=new Box();//b1 is a no Arguments Constructor
		System.out.println("No Argument Volumn:"+(b1.volumn()));
		
		System.out.println("1 Arguments Inputs ========");
		System.out.println("Enter Weight : ");
		w=scan.nextInt();
		Box b2=new Box(w);
		System.out.println("1 Arguments Volumn :"+(b2.volumn()));
		
		
		System.out.println("2 Arguments Inputs ========");
		System.out.println("Enter Weight : ");
		w=scan.nextInt();
		System.out.println("Enter Height : ");
		h=scan.nextInt();
		Box b3=new Box(w,h);
		System.out.println("2 Arguments Volumn :"+(b3.volumn()));
		
		System.out.println("3 Arguments Inputs ========");
		System.out.println("Enter Weight : ");
		w=scan.nextInt();
		System.out.println("2 Arguments Inputs ========");
		System.out.println("Enter Height : ");
		h=scan.nextInt();
		System.out.println("2 Arguments Inputs ========");
		System.out.println("Enter Breath : ");
		b=scan.nextInt();
		Box b4=new Box(w,h,b);
		System.out.println("3 Arguments Volumn :"+(b4.volumn()));
		scan.close();
		
	}

}
