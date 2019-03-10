package stu.singleton.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegistrySingleton {

	private static Map<String, Object> maps = new ConcurrentHashMap<String, Object>();

	@SuppressWarnings("deprecation")
	public static Object getBean(String className) {
		if (!maps.containsKey(className)) {
			synchronized (maps) {
				if (!maps.containsKey(className)) {
					try {
						maps.put(className, Class.forName(className).newInstance());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return maps.get(className);
	}

}
