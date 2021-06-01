package sampe;

import java.util.List;
import java.util.Arrays;

public class DemoForEach {
	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,3,4,5);
		//1.8 feature
		ls.forEach(i->System.out.println(i));
		//another possible
		ls.forEach(System.out::println);
	}

}
