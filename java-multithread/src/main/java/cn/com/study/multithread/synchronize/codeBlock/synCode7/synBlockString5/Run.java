/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5   
 * @author: penggang
 * @date:   2018��1��31�� ����12:52:22   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5;

/**  
 * synchronized(��this����x)ͬ���������Խ��"���"����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P88   
 * @author: penggang
 * @date:   2018��1��31�� ����12:52:22   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();

		MyThread1 thread1 = new MyThread1(list);
		thread1.setName("A");
		thread1.start();

		MyThread2 thread2 = new MyThread2(list);
		thread2.setName("B");
		thread2.start();
		
		Thread.sleep(6000);
		
		System.out.println("listSize=" + list.getSize());
	}
}
