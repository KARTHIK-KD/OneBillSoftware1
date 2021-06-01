import java.util.TreeSet;

public class TreeSetDesc {
	public static void main(String[] args) {
		TreeSet<Object> treeobj=new TreeSet<Object>();
		treeobj.add(10);
		treeobj.add(23);
		treeobj.add(2);
		treeobj.add(48);
		treeobj.add(27);
		treeobj.add(38);
		treeobj.add(15);
		treeobj.add(11);
		System.out.println("TreeSet Elements : "+treeobj);
		TreeSet<Object> obj=(TreeSet<Object>) treeobj.descendingSet();
		System.out.println("TreeSet Desc Order : "+obj);
	}

}
