/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.lock.reentrantReadWriteLock.test3   
 * @author: penggang
 * @date:   2018��2��15�� ����4:06:40   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.lock.reentrantReadWriteLock.test3;

/**  
 * ��д����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P238   
 * @author: penggang
 * @date:   2018��2��15�� ����4:06:40   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {

		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		Thread.sleep(1000);

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}
}
