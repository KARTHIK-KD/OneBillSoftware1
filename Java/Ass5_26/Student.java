import java.util.Scanner;

class Eligibility {

	static void toCheck(int age, double weight){

		if (age < 15 || weight < 40.0)
			System.out.println("Not Eligible for Registration !");
		else
			System.out.println("Registered Successfully!");

	}
}

public class Student {

	public static void main(String[] args) {

		int age;
		double weight; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		System.out.println("Enter your weight : ");
		weight = sc.nextDouble();
		try {
			Eligibility.toCheck(age, weight);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}