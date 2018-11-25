package cn.com.study.threadFramework.Semaphore.twoMethod;

import java.util.concurrent.Semaphore;

public class MyService {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		try {
			semaphore.acquire();
			Thread.sleep(1000);
			System.out.println("���д�Լ" + semaphore.getQueueLength() + "���߳��ڵȴ�");
			System.out.println("�Ƿ����߳����ڵȴ��ź����أ�" + semaphore.hasQueuedThreads());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
