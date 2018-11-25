/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.tryAcquire_2   
 * @author: penggang
 * @date:   2018��2��16�� ����11:51:49   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.tryAcquire_2;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��16�� ����11:51:49   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(3);

	public void testMethod() {
		if (semaphore.tryAcquire(3)) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "��ѡ���룡");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			// ����release��Ӧ��permitsֵҲҪ����
			semaphore.release(3);
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "δ�ɹ����룡");
		}

	}
}