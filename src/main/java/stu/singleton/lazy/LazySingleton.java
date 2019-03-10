package stu.singleton.lazy;

public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
		if (instance != null) {
			throw new RuntimeException("不能重复实例化单例！");
		}
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}

	private Object readResolve() {
		return instance;
	}

}
