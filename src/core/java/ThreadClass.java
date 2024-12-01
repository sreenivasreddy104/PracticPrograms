package core.java;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("who i'm" + Thread.currentThread().getName() + i);
		}
	}
}
