
public class ExcDemo4 {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7};
		int[] arr2= {2,0,3,0,4,0,6};
		try {
		for(int i=0;i<arr1.length;i++) {
			try {
				System.out.println(arr1[i]/arr2[i]);
			}catch(ArithmeticException e) {
				System.out.println("Inner Error");
			}
		}
		}catch(Exception e) {
			System.out.println("Outer Error");
		}
	}

}


