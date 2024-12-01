package core.java;

public class SingletonDesignPattern {

	private static SingletonDesignPattern singletonDesignPattern;
	
	private SingletonDesignPattern() {}
	
	public static SingletonDesignPattern loadSingletonDesignPattern() {
		if (singletonDesignPattern == null) {
			singletonDesignPattern = new SingletonDesignPattern();
			System.out.println("Object Created....");
		}
		return singletonDesignPattern;
	}
	
	public static void main(String[] args) {
		SingletonDesignPattern loadSingletonDesignPattern = SingletonDesignPattern.loadSingletonDesignPattern();
		SingletonDesignPattern loadSingletonDesignPattern1 = SingletonDesignPattern.loadSingletonDesignPattern();
	}
}
