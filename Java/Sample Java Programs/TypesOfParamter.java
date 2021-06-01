package sampe;

class tyOfParameter{
	public void display(char c)
	{
		System.out.println("Character");
	}
	public void display(int val) {
		System.out.println("Integer");
	}
}

public class TypesOfParamter {
	public static void main(String[] args) {
		
		tyOfParameterr obj=new tyOfParameter();
		obj.display('c');
		obj.display(10);
	}

}
