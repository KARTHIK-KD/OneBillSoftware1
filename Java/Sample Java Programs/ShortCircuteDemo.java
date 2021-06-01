package sampe;

public class ShortCircuteDemo {
	public static void main(String[] args) {
		if(false && true && true)
		{
			System.out.println("Short Circute && stmt if is running ");
		}
		else
		{
			System.out.println("Short Circute && stme else is running");
		}
		if(true || false || true)
		{
			System.out.println("Short Circute || stmt if is running ");
		}
		else
		{
			System.out.println("Short Circute || stme else is running");
		}
	}

}
