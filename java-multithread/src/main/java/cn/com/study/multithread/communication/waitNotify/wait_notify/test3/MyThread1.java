/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread1.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test3   
 * @author: penggang
 * @date:   2018��1��31�� ����11:12:40   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test3;

/**  
 * @ClassName:  MyThread1   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����11:12:40   
 * 
 **/
public class MyThread1 extends Thread{
	
	private Object lock;            //��this��x����

	public MyThread1(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("��ʼ      wait time=" + System.currentTimeMillis());
				lock.wait();             //ʹ��ǰ�߳̽��еȴ���
				System.out.println("����      wait time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
