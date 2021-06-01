package sampe;

public class Switch {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			switch(i)
			{
			case 0:System.out.println("i is less than 1");break;
			case 1:System.out.println("i is less than 2");break;
			case 2:System.out.println("i is less than 3");break;
			case 3:System.out.println("i is less than 4");break;
			case 4:System.out.println("i is less than 5");break;
			default:System.out.println("Default values");
			}
		}
	}

}
