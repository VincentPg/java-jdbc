/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.tryAcquire_1   
 * @author: penggang
 * @date:   2018��2��16�� ����11:38:46   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.tryAcquire_1;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��16�� ����11:38:46   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		if (semaphore.tryAcquire()) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "��ѡ���룡");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			semaphore.release();
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "δ�ɹ����룡");
		}
	}
}
