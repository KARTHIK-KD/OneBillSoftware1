
import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
		//insert elements
		lhm.put("karthik", 2);
		lhm.put("saravanan", 1);
		lhm.put("mani",3);
		//get particular values
		System.out.println("Get Method : "+lhm.get("saravanan"));
		//size of the LinkedHashMap
		System.out.println("Size Method : "+lhm.size());
		//reove one particular element using key values
		System.out.println("Remove Method : "+lhm.remove("karthik"));
		System.out.println("Size Method : "+lhm.size());
		System.out.println("Print Values : "+lhm);
		
	}

}
