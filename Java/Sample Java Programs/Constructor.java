
class Values{
	int a,b;
	//Constructor
	public Values(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int sum(){
		return a+b;
	}
	
	}
public class Constructor {
	public static void main(String[] args) {
		Values v=new Values(10,20);//calling constructor
		System.out.println((v.sum()));
	}

}
