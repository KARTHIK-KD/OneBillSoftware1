import java.util.Scanner;

public class BikeRiders {
	public static void main(String[] args) {
		int num,daysRiders=0,endRiders=0,daykm=0,endkm=0,km;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
		System.out.println("Are you Rider ? ");
		String str=scan.next();
		if(str.equalsIgnoreCase("yes")) {
			System.out.println("Choose one WeekDays (1) / Weekend (2) : ");
			num=scan.nextInt();
			if(num==1) {
				daysRiders++;
				System.out.println("How many Km travel ");
				km=scan.nextInt();
				daykm+=km;
			}
			else if(num==2) {
				endRiders++;
				System.out.println("How many km travel ");
				km=scan.nextInt();
				endkm+=km;
			}
			
		}
		System.out.println("are you exit press 0");
		int n=scan.nextInt();
		if(n==0)
			break;
		}
		System.out.println("travel list");
		System.out.println("DaysRiders : "+daysRiders+"  travel : "+daykm);
		System.out.println("EndRidders : "+endRiders+" travel : "+endkm);
		
	}

}
