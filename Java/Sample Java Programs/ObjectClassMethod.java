package sampe;

public class ObjectClassMethod {
	public static void main(String[] args) {
		System.out.println(Integer.toString(12));//Convert integer to string
		
		Integer i=new Integer(5);
		System.out.println(i.getClass());//return runtime class of an object
		
		System.out.println(i.hashCode());//return hash code value 
		
		String s1="karthik";
		String s2="karthik";
		System.out.println(s1.equals(s2));//return true or false
		
		
		}
		
		
	}

}
