package sampe;

class Employee1{
	String name;
	int roll;
	static String companyName="OneBill";
	static void chage()
	{
		companyName="TY";
	}
	public Employee1(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	void display()
	{
		System.out.println(name+" "+roll+" "+companyName);
	}
	
}

public class StaticMethodDemo {
	public static void main(String[] args) {
		Employee1 obj1=new Employee1("karthik",1);
		Employee1.chage();
		obj1.display();
	}

}
