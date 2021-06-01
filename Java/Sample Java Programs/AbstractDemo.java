
abstract class Bike{
	abstract void bikebreak();
	abstract void bikeStart();
}

class function extends Bike{

	@Override
	void bikebreak() {
		System.out.println("Bike not movie");
		
	}

	@Override
	void bikeStart() {
		System.out.println("Bike Ready to start");
		
	}
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		Bike b=new function();
		b.bikeStart();
		b.bikebreak();
		
	}

}
