/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.notifyAllThread   
 * @author: penggang
 * @date:   2018��2��1�� ����8:38:49   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.notifyAllThread;

/**  
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P150   
 * @author: penggang
 * @date:   2018��2��1�� ����8:38:49   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(1000);

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

	}
}
