
package cn.com.study.threadFramework.Semaphore.MoreToOne_2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private Semaphore semaphore = new Semaphore(3);
	private ReentrantLock lock = new ReentrantLock();

	public void sayHello() {
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "׼��");
			lock.lock();
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "��ӡ"
						+ (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			lock.unlock();
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
