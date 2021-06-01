package sampe;

public class EnhanceForLoop {
	public static void main(String[] args) {
		int avg,sum=0;
		int[] arr= {1,2,3,4,5};
		for(int x:arr) {
			sum+=x;
		
		}
		avg=sum/arr.length;
		System.out.println(avg);
	}

}
