interface start{
	public void bikestart();
}

interface stop{
	public void bikestop();
}

class bike implements start,stop{
	@Override
	public void bikestop() {
		System.out.println("Bike is Start");
		
	}

	@Override
	public void bikestart() {
		System.out.println("bike is Stop");
		
	}
}

public class Interface {
	public static void main(String[] args) {
		start b=new bike();
		b.bikestart();
		stop b1=new bike();
		b1.bikestop();
		
	}



}
