/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread2.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test3   
 * @author: penggang
 * @date:   2018��1��31�� ����11:13:19   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test3;

/**  
 * @ClassName:  MyThread2   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����11:13:19   
 * 
 **/
public class MyThread2 extends Thread{
	
	private Object lock;

	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("��ʼnotify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("����notify time=" + System.currentTimeMillis());
		}
	}
}
