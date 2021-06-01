package sampe;

public class TwoDimensionaSquare {
	public static void main(String[] args) {
		int[][] array=new int[10][2];
		for(int i=0;i<10;i++) {
			array[i][0]=i+1;
			array[i][1]=(i+1)*(i+1);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(array[i][0]+" "+array[i][1]);
		}
	}

}
