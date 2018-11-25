/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  RepastService.java   
 * @Package cn.com.study.threadFramework.Semaphore.repast   
 * @author: penggang
 * @date:   2018��2��16�� ����12:38:16   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.repast;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**  
 * @ClassName:  RepastService   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��16�� ����12:38:16   
 * 
 **/
public class RepastService {

	volatile private Semaphore setSemaphore = new Semaphore(10);// ��ʦ
	volatile private Semaphore getSemaphore = new Semaphore(20);// �Ͳ���
	volatile private ReentrantLock lock = new ReentrantLock();
	volatile private Condition setCondition = lock.newCondition();
	volatile private Condition getCondition = lock.newCondition();
	volatile private Object[] producePosition = new Object[4];

	private boolean isEmpty() {
		boolean isEmpty = true;
		for (int i = 0; i < producePosition.length; i++) {
			if (producePosition[i] != null) {
				isEmpty = false;
				break;
			}
		}
		if (isEmpty == true) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isFull() {
		boolean isFull = true;
		for (int i = 0; i < producePosition.length; i++) {
			if (producePosition[i] == null) {
				isFull = false;
				break;
			}
		}
		return isFull;
	}

	public void set() {
		try {
			// System.out.println("set");
			setSemaphore.acquire();// ����ͬʱ�����10����ʦ��������
			lock.lock();
			while (isFull()) {
				// System.out.println("�������ڵȴ�");
				setCondition.await();
			}
			for (int i = 0; i < producePosition.length; i++) {
				if (producePosition[i] == null) {
					producePosition[i] = "����";
					System.out.println(Thread.currentThread().getName()
							+ " ������ " + producePosition[i]);
					break;
				}
			}
			getCondition.signalAll();
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			setSemaphore.release();
		}
	}

	public void get() {
		try {
			// System.out.println("get");
			getSemaphore.acquire();// ����ͬʱ�����16���Ͳ���
			lock.lock();
			while (isEmpty()) {
				// System.out.println("�������ڵȴ�");
				getCondition.await();
			}
			for (int i = 0; i < producePosition.length; i++) {
				if (producePosition[i] != null) {
					System.out.println(Thread.currentThread().getName()
							+ " ������ " + producePosition[i]);
					producePosition[i] = null;
					break;
				}
			}
			setCondition.signalAll();
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			getSemaphore.release();
		}
	}

}
