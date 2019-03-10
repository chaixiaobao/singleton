package stu.singleton.threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	private static final int SIZE = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exec = Executors.newCachedThreadPool();

		for (int i = 0; i < SIZE; i++) {
			exec.execute(new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					// ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
					System.out.println(
							Thread.currentThread().getName() + " " + ThreadLocalSingleton.getInstance());
				}
			});
		}

	}

}
