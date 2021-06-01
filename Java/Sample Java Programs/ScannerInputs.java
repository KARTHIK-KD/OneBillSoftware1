package sampe;

import java.util.Scanner;

public class ScannerInputs {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name=scan.nextLine();
		System.out.print("Enter the Gender : ");
		char gender=scan.next().charAt(0);
		System.out.print("Enter the Age : ");
		int age=scan.nextInt();
		System.out.print("Enter the Salary : ");
		Double salary=scan.nextDouble();
		System.out.println("name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		scan.close();
	}

}
