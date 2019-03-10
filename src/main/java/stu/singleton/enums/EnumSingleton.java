package stu.singleton.enums;

public enum EnumSingleton {

	INSTANCE;

	public static EnumSingleton getInstance() {
		return INSTANCE;
	}

}
