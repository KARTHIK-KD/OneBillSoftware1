
public class MultipleCatch {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7};
		int[] arr2= {2,0,3,0,4,0,6};
		for(int i=0;i<arr1.length;i++) {
			try {
				System.out.println(arr1[i]/arr2[i]);
			}catch(Exception e) {
				System.out.println("Error");
			}
		}
	}

}
