package sampe;

class NumberOfParameter{
	public void display()
	{
		System.out.println("No Argument");
	}
	public void display(int val) {
		System.out.println("One Argument");
	}
}

public class NoOfParameter {
	public static void main(String[] args) {
		
		NumberOfParameter obj=new NumberOfParameter();
		obj.display();
		obj.display(10);
	}

}
