package sampe;

public class MinMax {
	public static void main(String[] args) {
		int min,max;
		int[] values= {10,20,30,40,50};
		min=values[0];
		max=values[0];
		for(int i=1;i<5;i++) {
			if(min>values[i]) min=values[i];
			if(max<values[i]) max=values[i];
		}
		System.out.println(min+" "+max);
	}

}
