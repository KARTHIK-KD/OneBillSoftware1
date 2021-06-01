package sampe;

import java.util.Optional;

public class OptionalExample {
	public Integer sum(Optional<Integer> a,Optional<Integer> b) {
		System.out.println(a.isPresent());
		System.out.println(b.isPresent());
		Integer first=a.orElse(new Integer(0));
		Integer second=b.get();
		return first+second;
	}
	
	public static void main(String[] args) {
		OptionalExample op=new OptionalExample();
		Integer value1=new Integer(20);
		Integer value2=new Integer(30);
		
		Optional<Integer> val1=Optional.ofNullable(value1);
		Optional<Integer> val2=Optional.of(value2);
		
		System.out.println(op.sum(val1, val2));
		
		
	}

}
