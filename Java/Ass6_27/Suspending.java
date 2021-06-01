
/*The suspend() method of thread class puts the thread from running to waiting state.
This method is used if you want to stop the thread execution and start it again when a certain event occurs.
This method allows a thread to temporarily cease execution.
The suspended thread can be resumed using the resume() method.*/



public class Suspending extends Thread {
	
	public synchronized void run() {
		for(int i=0;i<5;i++) {
		try {
			sleep(500);
			System.out.println(Thread.currentThread().getName());
		}catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println(i);
	}
	}
	
	public static void main(String[] args) {
		Suspending s1=new Suspending();
		Suspending s2=new Suspending();
		Suspending s3=new Suspending();
		
		s1.start();
		s2.start();
		
		s2.suspend();
		s2.resume();
		//s2.stop();
		
		s3.start();
		
	}

}
