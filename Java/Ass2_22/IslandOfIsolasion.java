
public class IslandOfIsolasion {
	IslandOfIsolasion i;
	public static void main(String[] args) {
		IslandOfIsolasion t1=new IslandOfIsolasion();
		IslandOfIsolasion t2=new IslandOfIsolasion();
		
		t1.i=t2;
		t2.i=t1;
		
		t1=null;
		t2=null;
		System.gc();
	}

}
