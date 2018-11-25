package cn.com.study.threadFramework.Semaphore.acquire;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��15�� ����7:13:05   
 * 
 **/
public class Service {
	
	private Semaphore semaphore = new Semaphore(10);

	public void testMethod() {
		try {
			semaphore.acquire(2);
			System.out.println(Thread.currentThread().getName()
					+ " begin timer=" + System.currentTimeMillis());
			int sleepValue = ((int) (Math.random() * 10000));
			System.out.println(Thread.currentThread().getName() + " ֹͣ��"
					+ (sleepValue / 1000) + "��");
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName()
					+ "   end timer=" + System.currentTimeMillis());
			semaphore.release(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
