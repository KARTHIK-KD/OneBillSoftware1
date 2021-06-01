
class value{
	int a=10,b=20;
	public int sum() {
		return a+b;
	}
}
public class GarpageCollector {
	public static void main(String[] args) {
		value v=new value();
		System.out.println(v);
		System.out.println(v.sum());
		v=null;
		System.gc();
		System.out.println(v);
	}

}
