/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.communication.wait_notify_lock.ReleaseLock   
 * @author: penggang
 * @date:   2018��2��1�� ����12:47:49   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify_lock.ReleaseLock;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��1�� ����12:47:49   
 * 
 **/
public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
