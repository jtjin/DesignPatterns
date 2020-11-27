package main.java.DesignPatterns.singleton.singleton5;

public class Singleton5 {
	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		public static final Singleton5 INSTANCE = new Singleton5();
	}

	// For test
	private int value = 100;

	public void addValue(int value) {
		this.value += value;
	}

	public int getValue() {
		return value;
	}
}
