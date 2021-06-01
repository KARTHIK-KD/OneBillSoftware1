
class Box{
	int length,breath,height;

	public Box(int length, int breath, int height) {
		super();
		this.length = length;
		this.breath = breath;
		this.height = height;
	}
	public int volumn() {
		return length*breath*height;
	}
	
}
public class ConstructorOverLoading {
	public static void main(String[] args) {
		Box b=new Box(10, 20, 30);
		System.out.println("Volume : "+b.volumn());
		
	}

}
