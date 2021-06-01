

class CustomerAccount{
	static int amount=1;
	public void dep(int amt) {
		for(int i=0;i<3;i++) {
			amount+=amt;
		}
		
		System.out.println("Your Account Balance is "+amount);
	}
	public void with(int amt) {
		if(amount>1000)
		{
			for(int i=0;i<3;i++)
			{
				amount-=amt;
			}
			
			System.out.println("Your Account Balance is "+amount);
			
		}
		else
		{
			System.out.println("Available balance enough");
		}
		
	}
}


class Deposit1 extends Thread{
	CustomerAccount customerref;
	public Deposit1(CustomerAccount p) {
		customerref=p;
	}
	public void run() {
		customerref.dep(1000);
	}
}

class Withdraw extends Thread{
	CustomerAccount customerref;
	public Withdraw(CustomerAccount p) {
		customerref=p;
	}
	public void run() {
		customerref.with(1000);
	}
}

public class WithdrawDeposit {
	public static void main(String[] args) {
		System.out.println("Bank Application ");
		CustomerAccount ca=new CustomerAccount();
		
		Deposit1 one=new Deposit1(ca);
		Withdraw two=new Withdraw(ca);
		
		one.start();
		two.start();
		
	}

}
