package sampe;

class Employee{
	String name;
	int roll;
	String companyName="Onebill";
	public Employee(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	void display()
	{
		System.out.println(name+" "+roll+" "+companyName);
	}
	
}

public class StaticVariableDemo {
	public static void main(String[] args) {
		Employee obj1=new Employee("karthik",1);
		obj1.display();
	}

}
