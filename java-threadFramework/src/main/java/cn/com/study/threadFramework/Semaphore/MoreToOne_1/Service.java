/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.MoreToOne_1   
 * @author: penggang
 * @date:   2018��2��16�� ����12:04:14   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.MoreToOne_1;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��16�� ����12:04:14   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(3);

	public void sayHello() {
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "׼��");
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "��ӡ"
						+ (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
