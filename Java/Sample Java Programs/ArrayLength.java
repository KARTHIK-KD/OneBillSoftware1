package sampe;

public class ArrayLength {
	public static void main(String[] args) {
		int[] list=new int[10];
		int[] num= {1,2,3,4};
		int[][] arr= {{1,2,3},{4,5,6,7},{8,9}};
		System.out.println(list.length);
		System.out.println(num.length);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
	}

}
