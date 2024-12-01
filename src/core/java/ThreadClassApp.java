package core.java;

public class ThreadClassApp {
	public static void main(String[] args) {
		ThreadClass threadClass = new ThreadClass();
		threadClass.setDaemon(true);
		threadClass.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("who i'm" + Thread.currentThread().getName());
		}
	}
}
