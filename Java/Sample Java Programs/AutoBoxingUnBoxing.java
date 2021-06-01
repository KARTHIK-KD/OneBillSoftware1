import java.util.List;
import java.util.ArrayList;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		
		//UnBoxing
		Integer i1=new Integer(10);
		int j=i1;
		System.out.println("Wrapper class Integer i : "+i1);
		System.out.println("conversion of wrapper to primitive j : "+j);
		
		//AutoBixing
		List<Integer> k=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			k.add(Integer.valueOf(i));
	}

}
