import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row,col;
		System.out.print("Enter the row : ");
		row=scan.nextInt();
		System.out.println("Enter the col :");
		col=scan.nextInt();
		int[][] matrix1=new int[row][col];
		int[][] matrix2=new int[row][col];
		System.out.println("Enter the element in first matrix ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the element in second matrix ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				matrix2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Add two matrix ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
			}
			System.out.println("\n");
		}
		scan.close();
	}

}
