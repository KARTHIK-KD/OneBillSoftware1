import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		for(int i=1;i<10;i++) {
			v.add(i);
			
		}
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		
	}
}
