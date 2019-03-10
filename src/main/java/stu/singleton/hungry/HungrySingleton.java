package stu.singleton.hungry;

public class HungrySingleton {

	private static final HungrySingleton INSTANCE = new HungrySingleton();

	private HungrySingleton() {
		if (INSTANCE != null) {
			throw new RuntimeException("不能重复实例化单例！");
		}
	}

	public static HungrySingleton getInstance() {
		return INSTANCE;
	}

	private Object readResolve() {
		return INSTANCE;
	}

}
