package stu.singleton.inner;

public class InnerSingleton {

	private InnerSingleton() {
		if (InnerHolder.INSTANCE != null) {
			throw new RuntimeException("不能重复实例化单例！");
		}
	}

	public static InnerSingleton getInstance() {
		return InnerHolder.INSTANCE;
	}

	private static class InnerHolder {
		private static final InnerSingleton INSTANCE = new InnerSingleton();
	}

	private Object readResolve() {
		return InnerHolder.INSTANCE;
	}

}
