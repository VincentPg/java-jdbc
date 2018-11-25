package cn.com.study.multithread.lock.reentrantLock.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();	//新建lock对象

	public void testMethod() {
		lock.lock();							//获取锁
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ (" " + (i + 1)));
		}
		lock.unlock();							//释放锁
	}

}
