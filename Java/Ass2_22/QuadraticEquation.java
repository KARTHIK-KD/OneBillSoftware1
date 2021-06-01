import java.lang.Math;

public class QuadraticEquation {
	public static void main(String[] args) {
		int a=2,b=3,c=4;
		float result1=(float) ((-b+(Math.sqrt((Math.pow(b, 2)))-4*a*c))/2*a);
		float result2=(float) ((-b-(Math.sqrt((Math.pow(b, 2)))-4*a*c))/2*a);
		System.out.println(result1+" "+result2);
	}
}
