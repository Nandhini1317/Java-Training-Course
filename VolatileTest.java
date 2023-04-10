class VolatileA extends Thread {
	int local_value = 6;
	public void run() {
		System.out.println("Thread started");
			for (int i = 1; i <= 6; i++) {
				System.out.println("local_value = " + i);	
		} 
		System.out.println("Thread ended");
	}

}

public class VolatileTest {
	public static void main(String[] args) {
		System.out.println("Code started");
		VolatileA vr = new VolatileA();
		vr.start();
		System.out.println("Code ended");
	}

}