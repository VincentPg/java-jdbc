package cn.com.study.multithread.lock.reentrantLock.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();	//�½�lock����

	public void testMethod() {
		lock.lock();							//��ȡ��
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ (" " + (i + 1)));
		}
		lock.unlock();							//�ͷ���
	}

}
