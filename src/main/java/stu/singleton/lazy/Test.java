package stu.singleton.lazy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	private static int SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exec = Executors.newCachedThreadPool();
		final CountDownLatch latch = new CountDownLatch(SIZE);

		for (int i = 0; i < SIZE; i++) {
			exec.execute(new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					try {
						latch.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					LazySingleton singleton = LazySingleton.getInstance();
					System.out.println(singleton);
				}
			});
			latch.countDown();
		}
		exec.shutdown();

	}

}
