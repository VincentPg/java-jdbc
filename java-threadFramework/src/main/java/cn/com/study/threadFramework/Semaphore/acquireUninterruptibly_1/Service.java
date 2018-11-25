/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.acquireUninterruptibly_1   
 * @author: penggang
 * @date:   2018��2��15�� ����7:25:56   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.acquireUninterruptibly_1;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��15�� ����7:25:56   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()
					+ " begin timer=" + System.currentTimeMillis());
			for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println(Thread.currentThread().getName()
					+ "   end timer=" + System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			System.out.println("�߳�" + Thread.currentThread().getName()
					+ "������catch");
			e.printStackTrace();
		}
	}
}
