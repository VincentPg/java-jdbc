/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  RUn.java   
 * @Package cn.com.study.multithread.communication.wait_notify_lock.ReleaseLock   
 * @author: penggang
 * @date:   2018��2��1�� ����12:46:33   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify_lock.ReleaseLock;

/**  
 * ����wait()�Զ��ͷ���
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P143    
 * @author: penggang
 * @date:   2018��2��1�� ����12:46:33   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

	}
}
