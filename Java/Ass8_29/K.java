package sampe;

public class K extends A implements I,J {
	public static void main(String[] args) {
		K obj=new K();
		obj.show();
		//class is given priority / performance over interface
		//first class Main class K
		// second priority another class
		// third priority interface
	}
	/*
	 * public void show() { System.out.println("Calling K"); }
	 */

}
